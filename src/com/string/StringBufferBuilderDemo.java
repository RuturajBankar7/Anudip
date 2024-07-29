package com.string;

public class StringBufferBuilderDemo {

	public static void main(String[] args) {
		
		String s1="Rutu";
		String s2="Raj";
		
		System.out.println(s1+s2);
		
		//StringBuilder sbd="Java";//can not do this way
		//StringBuffer sbb="Program";
		
		StringBuilder sbd=new StringBuilder("Java");
		System.out.println(sbd);
		sbd.append("program");
		System.out.println(sbd);
		
		StringBuffer sbb=new StringBuffer("Good");
		System.out.println(sbb);
		sbb.append("night");
		System.out.println(sbb);

	}

}
