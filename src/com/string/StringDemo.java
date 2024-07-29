package com.string;

//string is most commonly used class in java
//it is encapsulated under java.lang package
//every string that you create is actually an object of type String
//string objects are immutable i.e. once a string is created it can not be altered
/*
* 1.using String Literal way
* String name="ruturaj";//it will get stoare in string pool area which is a part of heap only
* 
* 2.using new keyword
* String str=new String("ruturaj");//it will get stoare in heap
*/
public class StringDemo {
	
	//int a;
		//String name="ruturaj";//name is a reference and ruturaj is object//reference type of data. String is a predefined class
		//char a='A';
		
		//String is immutable class 1.2
		//StringBuffer mutable      1.5
		//StringBuilder mutable     1.5

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Rutu";
		String s2="Rutu";
		
		s1.concat(s2);//can not concat because string is immutable
		//s1=s1.concat(s2);//by this way you can concat
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
