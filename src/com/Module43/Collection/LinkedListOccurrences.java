package com.Module43.Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOccurrences {

	public static void main(String[] args) {
		
		// Create a Scanner object to read input from the user
		Scanner scanner =new Scanner(System.in);
		
		// Create a LinkedList to store integer values
		LinkedList<Integer> list = new LinkedList<>();
		
		// Prompt the user to enter the number of elements
		System.out.println("Enter the number of elements in the list");
		int numElements = scanner.nextInt();
		
		// Read the elements from the user and add them to the LinkedList
		System.out.println("Enter the elements");
		
		for(int i=0; i<numElements; i++)
		{
			int number=scanner.nextInt();
			list.add(number);
		}
		
		// Prompt the user to enter the element to find occurrences
		System.out.println("Enter the element to find out its first and last occurrence:");
		int element = scanner.nextInt();
		
		// Find the first occurrence of the specified element
		int firstIndex = list.indexOf(element);
		
		// Find the last occurrence of the specified element
		int lastIndex = list.lastIndexOf(element);
		
		// Print the results
		if(firstIndex == -1)
		{
			System.out.println("Element "+ element +" is not found in the list");
			
		}
		else
		{
			System.out.println("First occurrence of element " + element + " is at index: " + firstIndex);
	        System.out.println("Last occurrence of element " + element + " is at index: " + lastIndex);
		}
		
		// Close the scanner
		scanner.close();
	}

}

/*
 * 

 Dry Run

**Step 1: Initialization**
- A `Scanner` object is created to read user input.
- An empty `LinkedList<Integer>` named `list` is created.

**Step 2: User Input**
- The user is prompted to enter the number of elements.
- Suppose the user enters: `6`.

**Step 3: Read Elements**
- The user is prompted to enter the elements one by one.
- Suppose the user enters: `1`, `2`, `3`, `2`, `4`, `2`.

**Step 4: Adding Elements to LinkedList**
- Each entered element is added to the `list` LinkedList.
- The `list` LinkedList now contains: `[1, 2, 3, 2, 4, 2]`.

**Step 5: Prompt User for Element to Find**
- The user is prompted to enter the element to find its first and last occurrence.
- Suppose the user enters: `2`.

**Step 6: Find First and Last Occurrence**
- `list.indexOf(2)` is called, returning `1`.
- `list.lastIndexOf(2)` is called, returning `5`.

**Step 7: Print Results**
- The program prints the first and last occurrence of the element `2`.
- Output: 
  
  First occurrence of element 2 is at index: 1
  Last occurrence of element 2 is at index: 5
  

**Step 8: Scanner Closure**
- The `scanner` object is closed to free up resources.

 Output


Enter the number of elements in the list: 6
Enter the elements:
1
2
3
2
4
2
Enter the element to find its first and last occurrence: 2
First occurrence of element 2 is at index: 1
Last occurrence of element 2 is at index: 5
 */
