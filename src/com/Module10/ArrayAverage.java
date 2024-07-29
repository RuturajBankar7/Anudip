package com.Module10;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		//creating a sc object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		// Ask the user for the size of the array
		System.out.println("Enter the size of the string");
		int size=sc.nextInt();
		
		// Create an array of the specified size
		int[] array=new int[size];
		
		// Fill the array with user input
		System.out.println("Enter the elements to stoare in the array");
		
		for(int i=0; i<size; i++)
		{
			System.out.println("Element "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		
		// Calculate the sum
		int sum = 0;
		for(int num : array) 
		{
			sum += num;
		}
		
		// Calculate the average
        double average = (double) sum / size;
        
       // Print the average
        System.out.println("Average of the array elements: " + average);
		
        sc.close();
	}

}

/*dry run of the provided Java code:

1. The program starts by importing the Scanner class.

2. It defines a class named ArrayAverage.

3. Inside the `main` method:
   a. It creates a `Scanner` object named sc.
   b. It prompts the user to enter the size of the array.
   c. It reads the size entered by the user.
   d. It creates an integer array named array with the specified size.
   e. It prompts the user to enter elements to store in the array.
   f. It reads elements from the user and stores them in the array.
   g. It calculates the sum of all elements in the array using an enhanced for loop.
   h. It calculates the average by dividing the sum by the size of the array.
   i. It prints the calculated average.

Let's illustrate this with a dry run example:

Enter the size of the array: 5
Enter the elements to store in the array:
Element 1: 10
Element 2: 20
Element 3: 30
Element 4: 40
Element 5: 50

Calculation:
sum = 10 + 20 + 30 + 40 + 50 = 150
average = 150 / 5 = 30

Output:
Average of the array elements: 30.0
*/


