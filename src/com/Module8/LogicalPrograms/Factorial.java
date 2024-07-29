package com.Module8.LogicalPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		// Creating a Scanner object to read input from the user
		Scanner sc=new Scanner(System.in);
		
		// Prompting the user to enter a positive number
		System.out.println("Enter a positive number");
		int n=sc.nextInt();
		
		// Checking if the entered number is negative
		if(n<0)
		{
			System.out.println("Please enter a positive number");
		}
		else
		{
		    // Initializing factorial to 1
			int factorial=1;
			int i=1;
			
			// Loop to calculate the factorial
			while(i<=n)
			{
				factorial *=i;// Multiply factorial by i
				i++;// Increment i
			}
			
			// Printing the result
			System.out.println("Factorial of "+n+" is : "+factorial);
		}

	}

}

/*
dry run of the program with an example input.

Suppose the user enters n = 5.

1.The program prompts the user to enter a positive number.
2.User enters 5.
3.Since 5 is not negative, it proceeds.
4.factorial is initialized to 1.
5.i is initialized to 1.
6.The while loop starts:
For i = 1, factorial is multiplied by 1, so factorial remains 1.
i is incremented to 2.
For i = 2, factorial is multiplied by 2, so factorial becomes 2.
i is incremented to 3.
For i = 3, factorial is multiplied by 3, so factorial becomes 6.
i is incremented to 4.
For i = 4, factorial is multiplied by 4, so factorial becomes 24.
i is incremented to 5.
For i = 5, factorial is multiplied by 5, so factorial becomes 120.
i is incremented to 6.
Since i is now greater than n, the loop ends.
7.The program prints "Factorial of 5 is : 120".
*/

