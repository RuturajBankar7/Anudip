package com.Module3.Logical;


import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		// Creating a Scanner object to read input from the user
		Scanner sc=new Scanner(System.in);
		
		// Prompting the user to enter the first number
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		
		// Prompting the user to enter the second number
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		
	    // Prompting the user to choose an operation
		System.out.println("Choose an operation:");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.print("Enter your choice (1, 2, 3, or 4): ");
        int choice = sc.nextInt();
        
        double result;
        
        // Performing the chosen operation using a switch statement
        switch (choice) {
        case 1:
            // Addition
            result = n1 + n2;
            System.out.println("Result: " + n1 + " + " + n2 + " = " + result);
            break;
        case 2:
            // Subtraction
            result = n1 - n2;
            System.out.println("Result: " + n1 + " - " + n2 + " = " + result);
            break;
        case 3:
            // Multiplication
            result = n1 * n2;
            System.out.println("Result: " + n1 + " * " + n2 + " = " + result);
            break;
        case 4:
            // Division
            if (n2 == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                result = (double) n1 / n2; // Cast to double to get a precise result
                System.out.println("Result: " + n1 + " / " + n2 + " = " + result);
            }
            break;
        default:
            // Invalid choice
            System.out.println("Invalid choice.");
    }
        sc.close();
        
	}

}

/*
Dry Run Example
First number: 8
Second number: 3
Operation choice: 1 (Addition)
Dry Run Steps
1.Initialization:

The program starts and creates a Scanner object for input.

2.User Prompt - First Number:

The user is prompted to enter the first number.
User inputs 8.
n1 is set to 8.

3.User Prompt - Second Number:

The user is prompted to enter the second number.
User inputs 3.
n2 is set to 3.

4.User Prompt - Operation Choice:

The program prints the operation choices.
The user is prompted to choose an operation.
User inputs 1 (Addition).
choice is set to 1.

5.Switch Statement Execution:

The program enters the switch statement with choice equal to 1.
Case 1 (Addition):

result is calculated as 8 + 3.
result is set to 11.
The program prints: Result: 8 + 3 = 11.

6.End of Program:

The program ends after executing the selected operation.*/
