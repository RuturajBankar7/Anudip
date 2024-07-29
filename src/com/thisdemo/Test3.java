package com.thisdemo;

public class Test3 {
	
	int a;
	int b;
	
	Test3 ()
	{
		a=10;
		b=10;
	}
	
	void display(Test3 t3)
	{
		System.out.println(a+" "+b);
	}
	
	void get()
	{
		display(this);
	}
	
	

	public static void main(String[] args) {
		
		Test3 t3=new Test3();
		//t3.display();
		t3.get();

	}

}
