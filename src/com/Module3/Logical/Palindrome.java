package com.Module3.Logical;


import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		
		// Creating a Scanner object to read input from the user
		Scanner sc=new Scanner(System.in);
		
		// Prompting the user to enter a number
		System.out.println("Enter a number : ");
		int number=sc.nextInt();
		
		// Storing the original number for later comparison
		int originalNumber=number;
		int reverseNumber=0;
		
		// Loop to reverse the number
		while(number>0)
		{
		    // Getting the last digit of the number
			int digit=number%10;
			// Building the reversed number
			reverseNumber=reverseNumber*10+digit;
			// Removing the last digit from the number
			number/=10;
			
		}
		
		// Checking if the original number and the reversed number are the same
		if (originalNumber == reverseNumber) 
		{
			System.out.println(originalNumber + " is a palindrome.");
	    }else 
	    {
	    	System.out.println(originalNumber + " is not a palindrome.");
	    }
	}

}

/*
Dry Run Example
Let's perform a dry run of the program with the following input:

Number: 121
Dry Run Steps
1.Initialization:

The program starts and creates a Scanner object for input.

2.User Prompt:

The user is prompted to enter a number.
User inputs 121.
number is set to 121.
originalNumber is set to 121.
reverseNumber is initialized to 0.

3.Reversing the Number:

The while loop runs as long as number > 0.
Iteration 1:

number = 121
digit = 121 % 10 = 1
reverseNumber = 0 * 10 + 1 = 1
number = 121 / 10 = 12

Iteration 2:

number = 12
digit = 12 % 10 = 2
reverseNumber = 1 * 10 + 2 = 12
number = 12 / 10 = 1

Iteration 3:

number = 1
digit = 1 % 10 = 1
reverseNumber = 12 * 10 + 1 = 121
number = 1 / 10 = 0

4.End of Loop:

The loop ends as number is now 0.

5.Comparison:

The program compares originalNumber (121) and reverseNumber (121).
Since they are equal, the program prints: 121 is a palindrome.
*/
