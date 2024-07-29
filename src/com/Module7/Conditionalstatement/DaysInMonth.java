package com.Module7.Conditionalstatement;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		
		// Create a Scanner object to read input from the user
		Scanner sc =new Scanner(System.in);
		
		// Prompt the user to enter the month
		System.out.println("Ener the month between 1 to 12 : ");
		int month=sc.nextInt();// Read the month input
		
		// Prompt the user to enter the year
		System.out.println("Enter the year : ");
		int year=sc.nextInt();// Read the year input
		
		// Check if the month input is within the valid range
		if(month>=1 && month<=12)
		{
			int days;// Variable to store the number of days in the month
			
			// Determine the number of days in the specified month
			switch(month) {
			
			 // Months with 31 days
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				days=31;
				break;
			
			 // Months with 30 days	
			case 4: case 6: case 9: case 11: 
				days=30;
				break;
			
			// February, needs a leap year check	
			case 2:
				if(year%4 == 0)
				{
					days =29;
				}
				else
				{
					days=28;
				}
				break;
				
			default:
				days=-1;
				
			}
		    
		    // If days is not -1, then a valid month was entered
			if(days!=-1) {
			System.out.println("The number of days in the specified month are : " +days);
			
			}
			else
			{
			   
			System.out.println("Invalid month");
			}
		}
		else
		{
		     // If the month is not between 1 and 12, print an error message
			System.out.println("Invalid input. Please enter the month between 1 and 12");
			
		}
		
	}

}

/*
Dry Run of the Program
Example :

Input:
Month: 2
Year: 2020

Execution:
month is 2, which is valid.
Check if the year 2020 is a leap year.
2020 is a leap year because it is divisible by 4 and not by 100, or it is divisible by 400.
Set days to 29.
Output: "The number of days in the specified month are: 29".
*/

