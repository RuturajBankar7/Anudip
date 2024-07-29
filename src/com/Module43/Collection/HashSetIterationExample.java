package com.Module43.Collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetIterationExample {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a HashSet to store integer values
        HashSet<Integer> set = new HashSet<>();

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements in the HashSet: ");
        int numElements = scanner.nextInt();

        // Read the elements from the user and add them to the HashSet
        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            int number = scanner.nextInt();
            set.add(number);
        }

        // Print the original HashSet
        System.out.println("Original HashSet: " + set);

        // Iterate through all elements in the HashSet using an Iterator
        System.out.println("Iterating through the HashSet:");
       // Iterator<Integer> iterator = set.iterator();
        
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }

        // Close the scanner
        scanner.close();
    }
}
/*

Dry Run

**Step 1: Initialization**
- A `Scanner` object is created to read user input.
- An empty `HashSet<Integer>` named `set` is created.

**Step 2: User Input**
- The user is prompted to enter the number of elements.
- Suppose the user enters: `5`.

**Step 3: Read Elements**
- The user is prompted to enter the elements one by one.
- Suppose the user enters: `10`, `20`, `30`, `40`, `50`.

**Step 4: Adding Elements to HashSet**
- Each entered element is added to the `set` HashSet.
- The `set` HashSet now contains: `[10, 20, 30, 40, 50]` (the order may vary due to the nature of `HashSet`).

**Step 5: Print Original HashSet**
- The program prints the original `set` HashSet.
- Output: `Original HashSet: [10, 20, 30, 40, 50]` (order may vary).

**Step 6: Iterate Through HashSet**
- An  `iterator` is created for the `set` HashSet.
- The program iterates through the `iterator` and prints each element.

**Iteration Output:**
- Suppose the elements are printed in the following order (actual order may vary):
  ```
  Iterating through the HashSet:
  10
  20
  30
  40
  50


**Step 7: Scanner Closure**
- The `scanner` object is closed to free up resources.

### Output


Enter the number of elements in the HashSet: 5
Enter the elements:
10
20
30
40
50
Original HashSet: [10, 20, 30, 40, 50]
Iterating through the HashSet:
10
20
30
40
50
*/
