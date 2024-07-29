package com.superdemo;

class GrandParent
{
	String name="123";
}

class Parent extends GrandParent
{
	//String name=super.name;//this will give op as 123 Child
	String name;
}

public class Child extends Parent {
	
	String name;
	
	public void details()
	{
		super.name="Parent";
		name="Child";
		System.out.println(super.name+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c=new Child();
		c.details();
	}

}
