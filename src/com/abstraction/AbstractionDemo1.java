package com.abstraction;

abstract class Employee
{
	int a;//we can't declare a variable as abstract
	
	Employee()//we can't declare a constructor as abstract
	{
		
	}
	
	Employee(int a)
	{
		
	}
	
	abstract void leaves();
	abstract void salary();
	
	void show()
	{
		System.out.println("This is a concrete method");
	}
}

class Permanant_Emp extends Employee
{

	@Override
	void leaves() {
		System.out.println("20 leaves");
		
	}

	@Override
	void salary() {
		// TODO Auto-generated method stub
		
	}
	
}

class Contract_Emp extends Employee
{

	@Override
	void leaves() {
		System.out.println("24 leaves");
		
	}

	@Override
	void salary() {
		System.out.println("50000");
		
	}
	
}
public class AbstractionDemo1 {

	public static void main(String[] args) {
		
		//Employee emp=new Employee();//error because we can't create a object of the abstract method
		Contract_Emp ce=new Contract_Emp();
		ce.leaves();
		ce.salary();
		ce.show();//child class object calling parent class method

	}

}
