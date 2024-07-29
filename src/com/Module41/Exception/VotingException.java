package com.Module41.Exception;

import java.util.Scanner;

public class VotingException {
	// Method to validate the age for voting eligibility
	static void validateAge(int age)
	{
		// Check if age is less than 18
		if(age<18)
		{
			// Throw an ArithmeticException if age is less than 18
			throw new ArithmeticException("Age is less than 18");
		}
		else
		{
			// Print a message if age is 18 or above
			System.out.println("You can vote");
		}
	}

	public static void main(String[] args) {
		
		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		
		// Ask the user to enter their age

		System.out.println("Enter the age of the user : ");
		int age = sc.nextInt();
		
		// Call the validateAge method to check voting eligibility
		validateAge(age);
		System.out.println("Thank you");
		
		sc.close();

	}
	
	
}

/*
 * 
### Dry Run

**Step 1: Initialization**
- The program starts and creates a `Scanner` object to read user input.

**Step 2: User Input**
- The user is prompted to enter their age.
- Suppose the user enters: `17`.

**Step 3: Method Call**
- `validateAge(age)` is called with `age` being `17`.

**Inside `validateAge` method:**
1. **Age Check:**
- The method checks if `age` is less than `18`.
- Since `age` is `17`, which is less than `18`, the condition `age < 18` evaluates to `true`.

2. **Exception Throwing:**
- The method throws an `ArithmeticException` with the message "Age is less than 18".
- The execution of the `validateAge` method is halted, and control is transferred back to the `main` method.

**Step 4: Exception Handling**
- Since there is no try-catch block in the `main` method to handle the exception, the program terminates abnormally, and the exception message "Age is less than 18" is printed to the console.

**Step 5: Scanner Closure**
- The scanner object is closed implicitly when the program terminates.

### Output

The output of the program when the user enters `17` will be:
```
Enter the age of the user: 
17
Exception in thread "main" java.lang.ArithmeticException: Age is less than 18
at com.Module41.Exception.VotingException.validateAge(VotingException.java:13)
at com.Module41.Exception.VotingException.main(VotingException.java:33)
```

**Note**: The "Thank you" message and the closing of the scanner will not occur because the exception is not caught, and the program terminates before reaching those lines.

*/
