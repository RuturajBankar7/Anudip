package com.MethodOverloadingOverriding;


class Employee
{
	private String role;
	private String name;
	
	Employee()//because of this constructor there is no error while extending the class
	{
		
	}
	
	public Employee(String role, String name)
	{
		role=role;
		name=name;
		
	}
	
	public double calculateSalary()
	{
		return 0.0;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

class Manager extends Employee
{
	private double baseSalary;
	private double bonus;
	
	public Manager(double baseSalary, double bonus) {
		super();
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}
	
	public double calculateSalary()
	{
		return baseSalary+bonus;
	}	
	
}

class Programmer extends Employee
{
	private double baseSalary;
	private double overTime;
	
	/*public Programmer(double baseSalary, double overTime) {
		super();
		this.baseSalary = baseSalary;
		this.overTime = overTime;
	}*/
	
	
	
	public Programmer(double baseSalary, double overTime)
	{
		super();
		
		this.baseSalary=baseSalary;
		this.overTime=overTime;
	}
	

	public double calculateSalary()
	{
		return baseSalary+overTime;
	}	
	
	
	
}
public class Polymorphism1 {

	public static void main(String[] args) {
		
		Employee em=new Employee();
		em.setName("Ruturaj");
		System.out.println(em.getName());
		em.setRole("Manager");
		System.out.println(em.getRole());
		
		
		
	
		Employee emm=new Manager(34000,4000);
		System.out.println("Salary of Manager : " +emm.calculateSalary());
		
		Employee emp=new Programmer(20000,2000);
		System.out.println("Salary of Programmer : "+emp.calculateSalary());

	}

}
