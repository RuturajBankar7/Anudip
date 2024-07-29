package com.Module41.Exception;

import java.util.Scanner;

public class OddNumberExceptionHandling {
	
	// Custom exception class for handling odd numbers
	static class OddNumberException extends Exception
	{
		public OddNumberException(String message)
		{
			super(message);
		}
	}
	
	// Method to validate if the provided number is even
	static void validateEvenNumber(int number) throws OddNumberException
	{
		if(number%2 != 0)
		{
			// Throw an exception if the number is odd
			throw new OddNumberException("Odd number provided");
		}
		else
		{
			// Print a message if the number is even
			System.out.println("Even number provided: "+ number);
		}
	}

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter a number
		System.out.println("Enter a number");
		int userInput = sc.nextInt();
		
		try 
		{
			// Call the method to validate the user input
			validateEvenNumber(userInput);
		} 
		catch (OddNumberException e) 
		{
			// Catch the custom exception and print the exception message
			System.out.println("Exception caught: "+ e.getMessage());
		}
		finally
		{
			// Print a message indicating the end of the try-catch block
			System.out.println("End of exception handling");
		}
		
		sc.close();
		
		// Print a final message
		System.out.println("program ended");
		
	}

}

/*
 *  Dry Run

**Step 1: Initialization**
- An `OddNumberException` class is defined to handle exceptions for odd numbers.
- A `Scanner` object is created to read user input.

**Step 2: User Input**
- The user is prompted to enter a number.
- Suppose the user enters: `7`.

**Step 3: Method Call**
- `validateEvenNumber(userInput)` is called with `userInput` being `7`.

**Inside `validateEvenNumber` method:**
1. **Number Check:**
   - The method checks if `number % 2 != 0` to determine if the number is odd.
   - Since `7 % 2` equals `1`, which is not equal to `0`, the condition `number % 2 != 0` evaluates to `true`.

2. **Exception Throwing:**
   - The method throws an `OddNumberException` with the message "Odd number provided".
   - The execution of the `validateEvenNumber` method is halted, and control is transferred back to the `main` method.

**Step 4: Exception Handling**
- The `OddNumberException` is caught by the `catch` block in the `main` method.
- The message "Exception caught: Odd number provided" is printed to the console.

**Step 5: Finally Block**
- The message "End of exception handling" is printed.

**Step 6: Scanner Closure**
- The scanner object is closed to free up resources.

**Step 7: Final Message**
- The message "Program ended" is printed.

 Output

The output of the program when the user enters `7` will be:

Enter a number: 7
Exception caught: Odd number provided
End of exception handling
Program ended


If the user enters an even number, for example, `10`, the output will be:

Enter a number: 10
Even number provided: 10
End of exception handling
Program ended



 */
