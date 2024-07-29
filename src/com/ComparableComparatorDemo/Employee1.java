package com.ComparableComparatorDemo;

public class Employee1 implements Comparable<Employee1>{
	
	private int id;
	private String name;
	private double sal;
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		if(id > o.id)
		{
			return 1;
		}
		else if(id < o.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	/*public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		if(name > o.name)
		{
			return 1;
		}
		else if(name < o.name)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}*/

	
	
	
	
	

}
