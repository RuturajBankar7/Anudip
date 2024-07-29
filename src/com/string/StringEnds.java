package com.string;

import java.util.Scanner;

public class StringEnds {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your string");
		String string=sc.nextLine();
		
		System.out.println("Enter the suffix");
		String suffix=sc.nextLine();
		
		if(string.endsWith(suffix))
		{
			System.out.println("The string ends with "+suffix);
		}
		else
		{
			System.out.println("The string does not ends with "+suffix);
		}

	}

}
