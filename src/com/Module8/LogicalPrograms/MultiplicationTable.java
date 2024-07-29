package com.Module8.LogicalPrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		// Creating a Scanner object to read input from the user
		Scanner sc= new Scanner(System.in);
		
		// Prompting the user to enter a number
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		
		// Printing the header for the multiplication table
		System.out.println("Multiplication table of "+n+" : ");
		
		// Loop to generate and print the multiplication table
		for(int i=1; i<=10; i++)
		{
		    // Calculating the result of n multiplied by i
			int k=i*n;
			// Printing the current line of the multiplication table
			System.out.println(n+" * "+i+" = "+k);
		}
		
	}

}
/*
dry run for one iteration of the loop, assuming n=5:

1.Initialization

A Scanner object sc is created to take user input.

2.Prompt User for Input

Output: "Enter an integer : "

3.User Input

User enters 5.
int n = sc.nextInt(); reads the input value 5 and assigns it to n.

4.Display Multiplication Table Heading

Output: "Multiplication table of 5 :"

5.First Iteration of the Loop (i=1)

Calculate result as 5 * 1 = 5.
int result = n * i; sets result to 5.
Print the multiplication expression and its result.
Output: "5 * 1 = 5".
*/

