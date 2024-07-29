package com.string;

import java.util.Scanner;

public class ContainTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your string");
		String string=sc.nextLine();
		
		System.out.println("Enter the sequence");
		String sequence=sc.nextLine();
		
		boolean containsSequence=string.contains(sequence);
		
		if(containsSequence)
		{
			System.out.println("The string contains the specified sequence.");
		}
		else 
	    {
	        System.out.println("The string does not contain the specified sequence.");
	    }

	}

}
