package com.Module7.Conditionalstatement;



import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		
		// Create a Scanner object for user input
		Scanner sc=new Scanner(System.in);
		
		// Prompt the user to enter an integer
		System.out.println("Enter an integer : ");
		int n=sc.nextInt();// Read the integer value entered by the user
		
		// Display a message indicating the start of the cube calculation
		System.out.println("Cubes of the numbers from 1 to "+n+" :");
		
		// Loop from 1 to n to calculate and print the cube of each number
		for(int i=1; i<=n; i++)
		{
		    // Calculate the cube of the current number
			int cube = i*i*i;
			// Print the current number and its cube
			System.out.println(i+"^3 = "+cube);
		}
		
	}

}

/*
Dry Run Steps for 
n=3

1.Initialization

A Scanner object sc is created to take user input.

2.Prompt User for Input

Output: "Enter an integer : "

3.User Input

User enters 3.
int n = sc.nextInt(); sets n to 3.

4.Display Range for Cubes

Output: "Cubes of the numbers from 1 to 3 :"

5.Loop from 1 to n (1 to 3)

Iteration 1 (i=1)
Calculate cube as 1 * 1 * 1.
Output: "1^3 = 1"
Iteration 2 (i=2)
Calculate cube as 2 * 2 * 2.
Output: "2^3 = 8"
Iteration 3 (i=3)
Calculate cube as 3 * 3 * 3.
Output: "3^3 = 27"
*/
