package com.thisdemo;

public class Test1 {
	
	int a;
	int b;
	
	Test1()
	{
		//this(20);//this() to invoke current class constructor
		this(10,10);
		System.out.println("Default Constructor");
	}
	
	

	public Test1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Double int Constructor");
	}
	
	public Test1(int a)
	{
		this.a=a;
		System.out.println("Single int constructor");
	}



	public static void main(String[] args) {
		
		Test1 t1=new Test1();

	}

}
