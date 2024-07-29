package com.PublicAccessModifier1;



public class J {
	
	public int i;
	
	public void methodOfJ()
	{
		System.out.println(i);
		K k=new K();
	}
	
	class K 
	{
		
	}
}

class L extends J
{
	void methodOfL()
	{
		J j=new J();
		j.methodOfJ();
		System.out.println(i);
		J.K jk=new J.K();
	}
}

class M
{
	void methodOfM()
	{
		J j=new J();
		j.methodOfJ();
		System.out.println(j.i);
		//J.K jk=new J.K();
	}
}
