package com.thisdemo;

public class Test2 {

	int a;
	int b;
	
	Test2()
	{
		
		a=10;
		b=20;
	}
	
	//reference type
	Test2 get()
	{
		return this;
	}
	
	void display()
	{
		System.out.println("a = "+a+" "+"b = "+b);
	}
	public static void main(String[] args) {
		//reference  //instance
		Test2 t2   = new Test2();
		//t2.display();
		t2.get().display();//calling two methods
		
	}

}
