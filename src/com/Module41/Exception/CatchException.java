package com.Module41.Exception;

import java.util.Scanner;

public class CatchException {
	
	// Method to validate if the provided value is non-negative
	static void validateValue(int value) throws Exception
	{
		if(value < 0)
		{
			// Throw an exception if the value is negative
			throw new Exception("Negative value provided");
		}
		else
		{
			// Print a message if the value is non-negative
			System.out.println("Valid value provided: " + value);
		}
	}

	public static void main(String[] args) {
		//Creating a Scanner object
		Scanner sc= new Scanner(System.in);
		
		// Prompt the user to enter a value
		System.out.println("Enter a value: ");
		int userInput=sc.nextInt();
		
		try {
			// Call the method to validate the user input
			validateValue(userInput);
		} catch (Exception e) {
			// Catch the exception and print the exception message
			System.out.println("Exception caught : " +e.getMessage());
			
		}
		finally
		{
			// Print a message indicating the end of the try-catch block
			System.out.println("End of try-catch block");
		}
		
		sc.close();
		
		System.out.println("Program ended");
	}

}

/*
 

### Dry Run

**Step 1: Initialization**
- A `Scanner` object is created to read user input.

**Step 2: User Input**
- The user is prompted to enter a value.
- Suppose the user enters: `-5`.

**Step 3: Method Call**
- `validateValue(userInput)` is called with `userInput` being `-5`.

**Inside `validateValue` method:**
1. **Value Check:**
   - The method checks if `value` is less than `0`.
   - Since `value` is `-5`, the condition `value < 0` evaluates to `true`.

2. **Exception Throwing:**
   - The method throws an `Exception` with the message "Negative value provided".
   - The execution of the `validateValue` method is halted, and control is transferred back to the `main` method.

**Step 4: Exception Handling**
- The `Exception` is caught by the `catch` block in the `main` method.
- The message "Exception caught: Negative value provided" is printed to the console.

**Step 5: Finally Block**
- The message "End of exception handling" is printed.

**Step 6: Scanner Closure**
- The scanner object is closed to free up resources.

**Step 7: Final Message**
- The message "Program ended" is printed.

 Output

The output of the program when the user enters `-5` will be:

Enter a value: -5
Exception caught: Negative value provided
End of exception handling
Program ended


If the user enters a non-negative value, for example, `10`, the output will be:

Enter a value: 10
Valid value provided: 10
End of exception handling
Program ended



 */
