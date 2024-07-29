package com.interfacedemo;

//one class implements another interface
//one class extends another class
//one interface extends another interface
//no concrete methods are allowed in the interface
//all the methods in the interface are public and abstract by default
//no concrete methods are allowed in interface till java 1.8
//after 1.8 version defination for the interface change
//if you are declaring any variable in interface then it should be compulsarily initialised
//we can not create object of interface
//interface is also a abstract

interface Employee
{
	int a=1;//by default public static final all
	public static final int b=1000;//should be compulsoriely initialized
	
	void salary();
	void leave();
	

}

class Permanent_Emp implements Employee
{

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("salary of PE is 50000");
		
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub
		System.out.println("PE can have 25 leaves");
		
	}
	
}

class Temporary_Emp implements Employee
{

	@Override
	public void salary() {
		System.out.println("salary of TE is 20000");
		
	}

	@Override
	public void leave() {
		System.out.println("TE can have 20 leaves");
		
	}
	
}

public class InterfaceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Employee e=new Employee();//can not create a object of the interface
		
		Permanent_Emp pe=new Permanent_Emp();
		pe.salary();
		pe.leave();
		
		Temporary_Emp te=new Temporary_Emp();
		te.salary();
		te.leave();
		
		Employee tp=new Temporary_Emp();//upcasting

	}

}
