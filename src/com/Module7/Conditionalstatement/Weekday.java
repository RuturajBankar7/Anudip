package com.Module7.Conditionalstatement;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		
		// Creating a Scanner object to read input from the user
		Scanner sc=new Scanner(System.in);
		
		// Prompting the user to enter a number
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		
		// Variable to store the corresponding weekday
		String weekday="";
		
		// Checking if the number is between 1 and 7
		if(n>=1 && n<=7)
		{
			
			// Using a switch statement to find the corresponding weekday
			switch(n)
			{
			case 1:
				weekday = "Monday";
				break;
			case 2:
				weekday = "Tuesday";
				break;
			case 3:
				weekday = "Wednesday";
				break;
			case 4:
				weekday = "Thursday";
				break;
			case 5:
				weekday = "Friday";
				break;
			case 6:
				weekday = "Saturday";
				break;
			case 7:
				weekday = "Sunday";
				break;
			
				
			}
			// Printing the corresponding weekday
			System.out.println("The weekday corresponds to " +n+ " is " +weekday);
		
		}
		else {
		    // Printing an error message if the number is not between 1 and 7
			System.out.println("Invalid input. Number must be between 1 and 7");
		}
		
		
	}

}

/*
Dry Run Example
Let's perform a dry run of the program with the following input:

Number: 3
Dry Run Steps

1.Initialization:
The program starts and creates a Scanner object for input.

2.User Prompt:
The user is prompted to enter a number.
User inputs 3.
n is set to 3.

3.Condition Checking:
The program checks if n is between 1 and 7:
3 >= 1 && 3 <= 7 is true.

4.Finding the Weekday:
The program uses a switch statement to find the corresponding weekday for 3:
case 3 matches.
weekday is set to Wednesday.

5.Printing the Result:
The program prints: The weekday corresponding to 3 is Wednesday.

6.End of Program:
The program ends after printing the result.
*/

