package com.Module21.String;

import java.util.Scanner;

public class StringContainsSequence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// Ask user to enter the string
		System.out.println("Enter a string");
		String string=sc.nextLine();
		
		// Ask user to enter the sequence of characters to search for
		System.out.println("Enter a sequence");
		String sequence=sc.nextLine();
		
		// Check if the input string contains the specified sequence
		boolean containsSequence=string.contains(sequence);
		
		// Print the result
		if(containsSequence)
		{
			System.out.println("The string contains the sequence");
		}
		else
		{
			System.out.println("The string does not contains the sequence");
			
		}
		
		sc.close();
		
		

	}

}

/* dry run of the program:

Suppose we run the program and input the following:


Enter a string: Hello world
Enter the sequence of characters to search for: wor


1. The program asks the user to enter a string. The user inputs "Hello world".
2. The program asks the user to enter the sequence of characters to search for. The user inputs "wor".
3. The program checks if the input string "Hello world" contains the sequence "wor".
4. The contains() method returns true since the string "Hello world" indeed contains the sequence "wor".
5. The program prints: "The string contains the specified sequence."

So, the output of the program would be:

The string contains the specified sequence.

*/