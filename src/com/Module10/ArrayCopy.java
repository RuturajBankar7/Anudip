package com.Module10;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// Ask the user for the size of the array
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		// Create the original array
		int[] originalArray=new int[size];
		
		// Ask the user to input elements for the original array
		System.out.println("Enter the elements to add in array");
		
		for(int i=0; i<size; i++)
		{
			System.out.println("Element "+(i+1)+" : ");
			originalArray[i]=sc.nextInt();
			
		}
		
		// Create a new array with the same length as the original array
		int[] copiedArray=new int[size];
		
		// Iterate through the original array and copy each element to the new array
		for(int i=0; i<size; i++)
		{
			copiedArray[i] = originalArray[i];
		}
		
		 // Print the original array
        System.out.print("\nOriginal Array: ");
        printArray(originalArray);
        
        // Print the copied array
        System.out.print("Copied Array: ");
        printArray(copiedArray);
		
		sc.close();
		
	}
	  // Method to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line after printing the array
    }
	

}

/*Let's perform a dry run with a specific input example:

Suppose the user enters the size of the array as 3 and provides the elements [10, 20, 30].

1. The program starts.
2. It prompts the user to enter the size of the array.
   User enters: 3
3. It creates an array originalArray of size 3.
4. It prompts the user to enter elements for the original array.
    User enters for each element:
      Element 1: 10
      Element 2: 20
      Element 3: 30
5. It creates an array copiedArray of size 3.
6. It copies each element of originalArray to copiedArray.
   copiedArray now contains [10, 20, 30].
7. It calls the printArray method with originalArray as an argument to print the original array.
    Original Array: 10 20 30
8. It calls the printArray method with copiedArray as an argument to print the copied array.
    Copied Array: 10 20 30
9. The program closes the Scanner object.
10. The program ends.
*/