package com.Module10;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		//creating a sc object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		// Ask the user for the size of the array
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		// Create an array of the specified size
		int[] array=new int[size];
		
		// Fill the array with user input
		System.out.println("Enter the elements in the array");
		
		for(int i=0; i<size; i++)
		{
			System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
		}
		
		// Calculate the sum
		int sum = 0;
		for (int num : array) 
		{
			sum += num;
		}

	    // Print the sum
		System.out.println("Sum of the array elements: " + sum);
		
		sc.close();
	}

}

/* Let's perform a dry run of the program with an array size of 5 and the elements 1, 2, 3, 4, 5 input by the user:

1. User Input:
   - The program prompts the user to enter the size of the array. Let's assume the user inputs `5`.

2. Array Initialization:
   - An array of integers is created with the size specified by the user input, i.e., an array of size 5 is created.

3. **User Input of Array Elements**:
   - The program prompts the user to enter each element of the array one by one. Let's assume the user inputs:
     - Element 1: `1`
     - Element 2: `2`
     - Element 3: `3`
     - Element 4: `4`
     - Element 5: `5`

4. Array Filling:
   - Each element entered by the user is stored in the respective index of the array:
     - `array[0] = 1
     - `array[1] = 2
     - `array[2] = 3
     - `array[3] = 4
     - `array[4] = 5

5. Sum Calculation:
   - The program calculates the sum of all elements in the array:
     - sum = 1 + 2 + 3 + 4 + 5 = 15

6. Printing the Sum:
   - Finally, the program prints out the sum of all elements in the array:
     - Sum of the array elements: 1`

That's the dry run of the program with the specified array size and elements input by the user.*/
