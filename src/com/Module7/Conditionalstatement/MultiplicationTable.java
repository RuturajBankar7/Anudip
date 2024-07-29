package com.Module7.Conditionalstatement;



import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		// Create a Scanner object for user input
		Scanner sc=new Scanner(System.in);
		
		// Create a Scanner object for user input
		System.out.println("Enter an integer : ");
		int n=sc.nextInt();// Read the integer value entered by the user
		
		// Display the multiplication table heading
		System.out.println("Multiplication table of "+n+" :");
		
		// Loop from 1 to 10 to calculate and print the multiplication table
		for(int i=1; i<=10; i++)
		{
		    // Calculate the result of n multiplied by the current number i
			int result =n*i;
			// Print the current multiplication expression and its result
			System.out.println(n+" * "+i+" = "+result);
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
