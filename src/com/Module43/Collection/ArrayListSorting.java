package com.Module43.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSorting {

	public static void main(String[] args) {
		
		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		
		// Create an ArrayList to store integer values
		ArrayList<Integer> numbers= new ArrayList<>();
		
		// Prompt the user to enter the number of elements
		System.out.println("Enter the number elements");
		int numElements=sc.nextInt();
		
		// Read the elements from the user and add them to the ArrayList
		System.out.println("Enter the elements : ");
		for(int i=0; i<numElements; i++)
		{
			int number = sc.nextInt();
			numbers.add(number);
		}
		
		// Print the original ArrayList
		System.out.println("Original ArrayList: " + numbers);
		
		// Sort the ArrayList using Collections.sort()
		Collections.sort(numbers);
		
		// Print the sorted ArrayList
		System.out.println("Sorted ArrayList: " + numbers);
		
		sc.close();
		
		

	}

}

/*
 *  Dry Run

**Step 1: Initialization**
- A `Scanner` object is created to read user input.
- An empty `ArrayList<Integer>` named `numbers` is created.

**Step 2: User Input**
- The user is prompted to enter the number of elements.
- Suppose the user enters: `5`.

**Step 3: Read Elements**
- The user is prompted to enter the elements one by one.
- Suppose the user enters: `4`, `2`, `5`, `1`, `3`.

**Step 4: Adding Elements to ArrayList**
- Each entered element is added to the `numbers` ArrayList.
- The `numbers` ArrayList now contains: `[4, 2, 5, 1, 3]`.

**Step 5: Print Original ArrayList**
- The program prints the original `numbers` ArrayList.
- Output: `Original ArrayList: [4, 2, 5, 1, 3]`

**Step 6: Sort the ArrayList**
- The `Collections.sort(numbers)` method is called to sort the `numbers` ArrayList in ascending order.
- The `numbers` ArrayList is now: `[1, 2, 3, 4, 5]`.

**Step 7: Print Sorted ArrayList**
- The program prints the sorted `numbers` ArrayList.
- Output: `Sorted ArrayList: [1, 2, 3, 4, 5]`

**Step 8: Scanner Closure**
- The `scanner` object is closed to free up resources.

Output


Enter the number of elements: 5
Enter the elements:
4
2
5
1
3
Original ArrayList: [4, 2, 5, 1, 3]
Sorted ArrayList: [1, 2, 3, 4, 5]



 */
