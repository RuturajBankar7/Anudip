package com.FinalVariable;

public class FinalVariable {
	
	final int a=5;
	
	void display()
	{
		//++a;//can't increament because of final variable
		System.out.println(a);
	}

	public static void main(String[] args) {
	
		
		FinalVariable f=new FinalVariable();
		System.out.println(f.a);

	}

}
