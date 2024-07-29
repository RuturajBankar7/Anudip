package com.superdemo;

/*class Parent3
{
	String name;
	
	public Parent3(String na)
	{
		name=na;
	}
}
public class Child3 extends Parent3 
{
	String name;
	
	public Child3(String n1, String n2)
	{
		//super.name=n1;
		super(n1);
		name=n2;
		
	}
	
	public void details()
	{
		System.out.println(super.name+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child3 c3=new Child3("Parent","Child");
		c3.details();

	}

}*/

class Parent3
{
	String name;

	public Parent3(String name) {
		super();
		this.name = name;
	}
	
}
public class Child3 extends Parent3 
{
	String name;
	
	
	
	public Child3(String name, String n) 
	{
		super(name);
		this.name=n;
		// TODO Auto-generated constructor stub
	}
	public void details()
	{
		System.out.println(super.name+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child3 c3=new Child3("Parent","Child");
		c3.details();

	}

}

