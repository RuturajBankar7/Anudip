package com.Module43.Collection;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		
		// Create a TreeSet to store integer values
		TreeSet<Integer> numbers = new TreeSet<>();
		
		// Prompt the user to enter the number of elements
		System.out.println("Enter the number of elemets in the TreeSet: ");
		int numElement = scanner.nextInt();
		
		// Read the elements from the user and add them to the TreeSet
		System.out.println("Enter the elements: ");
		
		for(int i=0; i<numElement; i++)
		{
			int number = scanner.nextInt();
			numbers.add(number);
		}
		
		// Print the original TreeSet
		System.out.println("Original TreeSet : "+ numbers);
		
		// Find and print numbers less than 7
		System.out.println("Numbers less than 7 : ");
		for(Integer number : numbers.headSet(7))
		{
			System.out.println(number);
		}
		
		scanner.close();

	}

}

/*
 Dry Run

**Step 1: Initialization**
- A `Scanner` object is created to read user input.
- An empty `TreeSet<Integer>` named `numbers` is created.

**Step 2: User Input**
- The user is prompted to enter the number of elements.
- Suppose the user enters: `6`.

**Step 3: Read Elements**
- The user is prompted to enter the elements one by one.
- Suppose the user enters: `3`, `6`, `9`, `1`, `5`, `8`.

**Step 4: Adding Elements to TreeSet**
- Each entered element is added to the `numbers` TreeSet.
- The `numbers` TreeSet now contains: `[1, 3, 5, 6, 8, 9]` (automatically sorted).

**Step 5: Print Original TreeSet**
- The program prints the original `numbers` TreeSet.
- Output: `Original TreeSet: [1, 3, 5, 6, 8, 9]`

**Step 6: Find and Print Numbers Less Than 7**
- `numbers.headSet(7)` is called, which returns a view of the set containing elements less than `7`.
- The program iterates over this subset and prints each number.
- Output: 
  
  Numbers less than 7:
  1
  3
  5
  6
  

**Step 7: Scanner Closure**
- The `scanner` object is closed to free up resources.

Output


Enter the number of elements in the TreeSet: 6
Enter the elements:
3
6
9
1
5
8
Original TreeSet: [1, 3, 5, 6, 8, 9]
Numbers less than 7:
1
3
5
6



*/