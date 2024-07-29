package com.Static;

public class StaticMethod {
	
	static int a;
	
	static void add()
	{
		++a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		//StaticMethod sm=new StaticMethod();
		//sm.add();
		add();
		add();
	}

}
