package com.Module7.Conditionalstatement;


import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {
		
		 // Creating a Scanner object to read input from the user
		Scanner sc=new Scanner(System.in);
		
		// Prompting the user to enter a numbe
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		// Checking if the number is positive
		if(n>0)
		{
			System.out.println("It is a positive number.");
		}
		// Checking if the number is negative
		else if(n<0)
		{
			System.out.println("It is a negative number");
		}
		// If the number is neither positive nor negative, it must be zero
		else
		{
			System.out.println("The number is 0");
		}

	}

}

/*
Dry Run Example
Let's perform a dry run of the program with the following input:

Number: 5
Dry Run Steps

1.Initialization:
The program starts and creates a Scanner object for input.

2.User Prompt:
The user is prompted to enter a number.
User inputs 5.
n is set to 5.

3.Condition Checking:
The program checks if n > 0:
5 > 0 is true.
The program prints: It is a positive number.

4.End of Program:
The program ends after printing the result.
*/

