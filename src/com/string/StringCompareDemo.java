package com.string;
/*
 * can be done in 3 ways
 * 1.using equals() method
 * 2.using == operator (Shallow comparison)
 * 3.by CompareTo() method(deep comparison)
 * 
 * for address compare use == method
 * for content compare use hashcode and equal
 * most of the times the o/p of equals to and hashcode will be same but 1 percent it can be different
 * 
 */

public class StringCompareDemo {

	public static void main(String[] args) {
		
		String s1="Rutu";
		String s2="Rutu";
		String s3=new String("Rutu");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);//false because == compares address
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));//true because equals method compares content
		
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s2.hashCode() == s3.hashCode());//gives o/p same as equals method most of the times
		
		String s4="0-42l";
		String s5="0-43l";
		System.out.println(s4.hashCode() == s5.hashCode());//should be false but giving o/p as true 
		
		
				
	}

}
