package com.Module21.String;

import java.util.Scanner;

public class StringWithCharArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// Ask user to enter the characters for the array
		System.out.println("Enter the characters for the array");
		String input=sc.nextLine();
		
		// Convert the input string to a character array
		char[] charArray= input.toCharArray();
		
		// Create a String object using the character array
		String str=new String(charArray);
		
		// Print the String object
		System.out.println("String created from character array : "+str);
		
		sc.close();

	}

}

/*
dry run of the program:

Suppose we run the program and input the following:


Enter the characters for the array: Hello World


1. The program asks the user to enter the characters for the array. The user inputs "Hello World".
2. The program converts the input string "Hello World" to a character array using the `toCharArray()` method. The resulting character array is {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'}.
3. The program then creates a String object from the character array {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'}.
4. Finally, the program prints the String object: "String created from character array: Hello World".

So, the output of the program would be:

String created from character array: Hello World


This demonstrates how the program takes user input for the character array and creates a String object from it.
*/