package com.Module41.Exception;

import java.util.Scanner;

import com.Module41.Exception.VowelChecker.NoVowelException;



public class VowelChecker {
	// Custom exception class
	static class NoVowelException extends Exception
	{
		public NoVowelException(String message)
		{
			super(message);
		}
	}

	// Method to check for vowels
	public static void checkForVowels(String input) throws NoVowelException
	{
		 // Convert the string to lower case to make the check case-insensitive
		String lowerCaseInput = input.toLowerCase();
		
		// Check if the string contains any vowels
		if(!lowerCaseInput.matches(".*[aeiou].*"))
		{
			throw new NoVowelException("The string does not contain any vowels.");
		}
	}
	public static void main(String[] args) {
		
		// Create a Scanner object to read input from the user
		Scanner sc= new Scanner(System.in);
		
		// Prompt the user to enter a string
		System.out.println("Enter a String");
		String userInput=sc.nextLine();
		
		try {
			// Call the method to check for vowels
			checkForVowels(userInput);
			
			// If no exception is thrown, print this message
			System.out.println("The String contain vowels");
			
		} catch (NoVowelException e) {
			
			// Catch the custom exception and print the exception message
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}



/* Dry Run

**Step 1: Initialization**
- The program starts and creates a Scanner object to read user input.

**Step 2: User Input**
- The user is prompted to enter a string.
- Suppose the user enters: `"bcdfgh"`.

**Step 3: Method Call**
- `checkForVowels(userInput)` is called with `userInput` being `"bcdfgh"`.

**Inside `checkForVowels` method:**
1. **Convert to Lowercase:**
   - `lowerCaseInput` is assigned the value `"bcdfgh"` (no change since the input is already lowercase).

2. **Regex Check:**
   - The method checks if `lowerCaseInput` matches the regex `".*[aeiou].*"`.
   - Since `"bcdfgh"` does not contain any vowels, the regex does not match.

3. **Exception Throwing:**
   - The method throws a `NoVowelException` with the message "The string does not contain any vowels."

**Step 4: Exception Handling**
- The `NoVowelException` is caught by the `catch` block in the `main` method.
- The message "The string does not contain any vowels." is printed to the console.

**Step 5: Scanner Closure**
- The `Scanner` object is closed to free up resources.

 Output

The output of the program will be:

Enter a string: bcdfgh
The string does not contain any vowels.


*/
