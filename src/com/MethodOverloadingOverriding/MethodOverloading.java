package com.MethodOverloadingOverriding;

//method overloading is more than one method with same name with different parameters in the same class

public class MethodOverloading {
	
	double result,a,b;
	
	void add(int a, int b)
	{
		result=a+b;
		System.out.println(result);
	}
	
	void add(int a, int b, int c)
	{
		double result=a+b+c;
		System.out.println(result);
	}
	
	void add(float a, int b, int c)
	{
		double result=a+b+c;
		System.out.println(result);
	}
	
	void add(int a,float b, int c)
	{
		float result=a+b+c;
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		MethodOverloading mo=new MethodOverloading();
		mo.add(1.1f, 1, 2);
		mo.add(2, 3, 5);
		mo.add(2, 2, 2);

	}

}
