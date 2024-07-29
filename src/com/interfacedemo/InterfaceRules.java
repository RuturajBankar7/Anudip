package com.interfacedemo;



//class extends class
//class implements interface
//interface extends interface

interface Employee1
{
	
}

interface Employee2
{
	
}

interface Employee3 extends Employee1//can extend two interface
{
	
}

interface Employee7 extends Employee1, Employee2//can extend two interface
{
	
}
/*interface Employee3 implements Employee1//can not implement two interface
{
	
}*/

class Employee4 implements Employee1, Employee2
{
	
}

class Employee5
{
	
}



class Permant_Employee extends Employee4 implements Employee1,Employee2,Employee3//multiple inheritance because of interface
{
	
}

class Contract_Empl implements Employee1
{
	
}




public class InterfaceRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
