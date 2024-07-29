package com.Constructor;

public class Constructor {

	 Constructor()
	{
		System.out.println("Default constructor");
	}
	
	Constructor(int i)
	{
		System.out.println("Parameterised constructor");
	}
	public static void main(String[] args) {
		
		Constructor c=new Constructor();
		Constructor c1=new Constructor(1);
	}

}
