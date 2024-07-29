package com.PrivateAccessModifier1;

class A
{
	private int i;
	
	private void methodOfA()
	{
		System.out.println(i);
		B b=new B();
	}
	
	private class B
	{
		
	}
}

class C extends A
{

	 void methodOfC()
	{
		A a=new A();
		//System.out.println(a.i); //error for this three because of private
		//a.methodOfA();
		//A.B ab=new A.B();
		
	}
}

class E
{
	private void methodOfE()
	{
		A a=new A();
		//System.out.println(a.i);//error for this three because of private
		//a.methodOfA();
		//A.B ab=new A.B();//even if there is no private this can't be done because it is not extended
	}
		
}
	
public class PrivateAccessModifier {

	public static void main(String[] args) {
		

	}

}
