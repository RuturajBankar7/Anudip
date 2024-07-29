package com.Inheritance;

class Employee
{
	void work()
	{
		System.out.println("Employee work");
	}
	
	void getSalary()
	{
		System.out.println("Salary of employee");
	}
	
}

class HRManager extends Employee
{
	void work()
	{
		System.out.println("HRManager work");
	}
	
	void getSalary()
	{
		System.out.println("HRManager salary");
	}
	
	void getEmployee()
	{
		System.out.println("HRManager adding a new employee");
	}
}

public class EmployeeInheritance {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		HRManager h=new HRManager();
		Employee em=new HRManager();
		
		//e.getSalary();
	//	e.work();
	//	h.getEmployee();
		em.getSalary();

	}

}
