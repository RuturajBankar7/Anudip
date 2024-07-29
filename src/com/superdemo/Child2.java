package com.superdemo;

class Parent1
{
	String name;
	
	public void details()
	{
		name="Parent";
		System.out.println(name);
	}
}

public class Child2 extends Parent1
{
	String name;
	
	public void details()
	{
		super.details();//calling parent class detail method
		name="Child";
		//this.name=name;
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		Child2 c2=new Child2();
		c2.details();

	}

}
