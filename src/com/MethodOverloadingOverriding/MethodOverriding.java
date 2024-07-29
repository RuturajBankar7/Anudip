package com.MethodOverloadingOverriding;
//method overriding is having same method name same parameter but in different class dosen't matter the class is extended or not
class Operation1
{
	void add(int a, int b)
	{
		int result=a+b;
		System.out.println(result);
	}
	
	void add(int a,int b,int c)
	{
		int result=a+b+c;
		System.out.println(result);
	}
	
	void add(int a,int b, float c)
	{
		float result=a+b+c;
		System.out.println(result);
	}
}

class Operation2 extends Operation1
{
	void add(int a,int b)
	{
		int result=a+b;
		System.out.println(result);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		

	}

}
