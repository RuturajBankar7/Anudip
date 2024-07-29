package com.Module7.Conditionalstatement;



import java.util.Scanner;

public class GreatNum1 {

	public static void main(String[] args) {
	    
	    // Creating a Scanner object to read input from the user	
		Scanner sc=new Scanner(System.in);
		
		// Prompting the user to enter three numbers
		System.out.println("Enter your three numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		// Initializing greatestnumber with the first number
		int greatestnumber=x;
		
		// Comparing the second number with the current greatest number
		if(y>greatestnumber)
		{
			greatestnumber=y;
		}
		// Comparing the third number with the current greatest number
		if(z>greatestnumber)
		{
			greatestnumber=z;
		}
		
		// Printing the greatest number
		System.out.println("The greatest number is " +greatestnumber);
	}

}

/*
Dry Run Example
Let's perform a dry run of the program with the following input:

Numbers: 12, 7, 15
Dry Run Steps

1.Initialization:
The program starts and creates a Scanner object for input.

2.User Prompt:
The user is prompted to enter three numbers.
User inputs 12, 7, 15.
x is set to 12.
y is set to 7.
z is set to 15.

3.Finding the Greatest Number:
greatestnumber is initialized to x (12).
The program checks if y (7) is greater than greatestnumber (12):
7 > 12 is false.
greatestnumber remains 12.
The program checks if z (15) is greater than greatestnumber (12):
15 > 12 is true.
greatestnumber is updated to 15.

4.Printing the Result:
The program prints: The greatest number is 15.

5.End of Program:
The program ends after printing the result.
*/

