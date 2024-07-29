package com.Inheritance;
//you can't inherit the final class and you can't override a final method
class Parent
{
	int p=0;
	
	void methodP()
	{
		System.out.println("Parent class " +p);
	}
}

class Child1 extends Parent
{
	 int q=0;
	
	void methodC1() 
	{
		System.out.println("Child class 1 " +q);
	}
}

class Child2 extends Parent
{
	int r=0 ;
	
	void methodC2() 
	{
		System.out.println("Child class 2 " +r);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.methodP();
		Child2 c2=new Child2();
		//c2.methodP();
		//c2.methodC1();
		c2.methodC2();
		Child1 c1=new Child1();
		c1.methodC1();
		
	}

}
