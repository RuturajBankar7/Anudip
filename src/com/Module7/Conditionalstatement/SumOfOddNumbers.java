package com.Module7.Conditionalstatement;



import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
	    
	    // Creating a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);
		
		// Asking the user to enter the value of n
		System.out.println("Enter the value of n : ");
		int n=sc.nextInt();
		int sum = 0;// Initializing sum to 0
		
		// Printing the entered value of n
		System.out.println("The numbers are : "+n);
		
		// Looping through the numbers from 1 to n
		for(int i=1; i<=n; i++)
		{
		    // Checking if the current number is even, if it is, skipping it
			if(i%2==0)
			{
				continue;// Skipping the even numbers
			}
			// Printing the odd number
			System.out.println(i);
			// Adding the odd number to the sum
			sum +=i;
		}
		// Printing the sum of the odd numbers
		System.out.println("The sum of the first "+n+" natural numbers is "+sum);

	}

}

/*
dry run of the program with an example input.

Suppose the user enters n = 5.

1.The program asks the user to enter the value of n.
2.User enters 5.
3.sum is initialized to 0.
4.The program prints "The numbers are : 5".
5.The loop starts from i = 1 and iterates till i <= n.
For i = 1, since 1 % 2 != 0, it's an odd number, so it prints 1 and adds 1 to the sum.
For i = 2, since 2 % 2 == 0, it's an even number, so it continues to the next iteration.
For i = 3, 3 % 2 != 0, so it prints 3 and adds 3 to the sum.
For i = 4, 4 % 2 == 0, so it continues.
For i = 5, 5 % 2 != 0, so it prints 5 and adds 5 to the sum.
6.The loop ends.
7.The program prints "The sum of the first 5 natural numbers is 9".
*/
