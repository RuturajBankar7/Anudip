package com.Module43.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapSizeExample {

	public static void main(String[] args) {
		
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		
		// Create a HashMap to store key-value pairs
		Map<String, String> map = new HashMap<>();
		
		// Prompt the user to enter the number of key-value pairs
		System.out.println("Enter the number of key-value pairs in the map");
		int numPairs = scanner.nextInt();
		scanner.nextLine();
		
		// Read the key-value pairs from the user and add them to the HashMap
		System.out.println("Enter the key-value pairs: ");
		
		for(int i=0; i< numPairs; i++)
		{
			System.out.println("Enter key " +(i+1)+ ": ");
			String key= scanner.nextLine();
			System.out.println("Enter value "+(i+1)+ ": ");
			String value = scanner.nextLine();
			map.put(key, value);
		}
		
		// Print the original HashMap
		System.out.println("Original HashMap : "+map);
		
		// Get the number of key-value mappings in the HashMap
		int size = map.size();
		
		// Print the number of key-value mappings
		System.out.println("Number of key-value mappings in the map : "+size);
		
		scanner.close();
		
		
	}

}

/*
 *  Dry Run

**Step 1: Initialization**
- A `Scanner` object is created to read user input.
- An empty `HashMap<String, String>` named `map` is created.

**Step 2: User Input**
- The user is prompted to enter the number of key-value pairs.
- Suppose the user enters: `3`.

**Step 3: Read Key-Value Pairs**
- The user is prompted to enter the key-value pairs one by one.
- Suppose the user enters the following pairs:
  - Key: `apple`, Value: `fruit`
  - Key: `carrot`, Value: `vegetable`
  - Key: `banana`, Value: `fruit`

**Step 4: Adding Key-Value Pairs to HashMap**
- Each entered key-value pair is added to the `map` HashMap.
- The `map` HashMap now contains: `{"apple"="fruit", "carrot"="vegetable", "banana"="fruit"}`.

**Step 5: Print Original HashMap**
- The program prints the original `map` HashMap.
- Output: `Original HashMap: {apple=fruit, carrot=vegetable, banana=fruit}`

**Step 6: Get and Print Size of HashMap**
- The `size` variable is assigned the result of `map.size()`, which is `3`.
- The program prints the number of key-value mappings.
- Output: `Number of key-value mappings in the map: 3`

**Step 7: Scanner Closure**
- The `scanner` object is closed to free up resources.

 Output


Enter the number of key-value pairs in the map: 3
Enter the key-value pairs:
Enter key 1: apple
Enter value 1: fruit
Enter key 2: carrot
Enter value 2: vegetable
Enter key 3: banana
Enter value 3: fruit
Original HashMap: {apple=fruit, carrot=vegetable, banana=fruit}
Number of key-value mappings in the map: 3



 */
