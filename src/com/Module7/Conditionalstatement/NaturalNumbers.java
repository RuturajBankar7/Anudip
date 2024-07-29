package com.Module7.Conditionalstatement;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		
		// Create a Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the value of n
		System.out.println("Enter the value of n : ");
		
		// Read the integer value entered by the user
		int n=sc.nextInt();
		// Initialize a variable to hold the sum of the natural numbers
		int sum = 0;
		
		// Display the value of n entered by the user
		System.out.println("The numbers are : "+n);
		
		// Loop from 1 to n, printing each number and adding it to the sum
		for(int i=1; i<=n; i++)
		{
		    // Print the current number
			System.out.println(i);
			// Add the current number to the sum
			sum +=i;
		}
		// Display the sum of the first n natural numbers
		System.out.println("The sum of the first "+n+" natural numbers is "+sum);
		
	}

}

/*

Dry Run Example
Assume the user inputs n = 5.

1.Initialization:

The program starts and creates a Scanner object for user input.
It prompts the user to enter the value of n.

2.User Input:

The user enters 5.
n is set to 5.

3.Display User Input:

The program prints: The numbers are : 5.

4.Loop Execution:

Iteration 1 (i = 1):
Print 1.
Add 1 to sum (sum = 1).
Iteration 2 (i = 2):
Print 2.
Add 2 to sum (sum = 3).
Iteration 3 (i = 3):
Print 3.
Add 3 to sum (sum = 6).
Iteration 4 (i = 4):
Print 4.
Add 4 to sum (sum = 10).
Iteration 5 (i = 5):
Print 5.
Add 5 to sum (sum = 15).

5.Final Output:

The program prints: The sum of the first 5 natural numbers is 15
*/

