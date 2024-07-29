package com.ProtectedAccessModifier1;

public class E {

	protected int i;
	
	protected void methodOfE()
	{
		System.out.println(i);
		F f=new F();
	}
	
	class F 
	{
		
	}
}

class G extends E
{
	void methodOfG()
	{
		E e=new E();
		e.methodOfE();
		System.out.println(e.i);
		E.F ef=new E.F();
	}
}

class H
{
	void methodOfH()
	{
		E e=new E();
		e.methodOfE();
		System.out.println(e.i);
		//E.F ef=new E.F();
	}
	
}
