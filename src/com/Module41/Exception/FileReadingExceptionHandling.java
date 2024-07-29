package com.Module41.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingExceptionHandling  {

	// Method to read a file and print its content
	static void readFile(String fileName) throws FileNotFoundException
	{
		// Create a File object with the provided file name
		File file = new File(fileName);
		
		// Create a Scanner object to read the file
		Scanner sc = new Scanner(file);
		
		// Read and print the content of the file line by line
		while(sc.hasNextLine())
		{
			String line = sc.nextLine();
			System.out.println(line);
		}
		
		sc.close();
	}
	public static void main(String[] args) {
		
		// Create a Scanner object to read input from the user
		Scanner inputScanner =new Scanner(System.in);
		
		// Prompt the user to enter the file name
		System.out.println("Enter the file name: ");
		
		String fileName = inputScanner.nextLine();
		
		try {
			// Call the method to read the file
			readFile(fileName);
		} 
		catch (FileNotFoundException e) {
			// Catch the FileNotFoundException and print the exception message
			System.out.println("Exception caught: "+e.getMessage());
		}
		finally
		{
			// Print a message indicating the end of the try-catch block
			System.out.println("End file reading process");
		}
		
		inputScanner.close();
		
		System.out.println("Program ended");
	}

}

/*
 * Dry Run

**Step 1: Initialization**
- A `Scanner` object is created to read user input.

**Step 2: User Input**
- The user is prompted to enter the file name.
- Suppose the user enters: `"example.txt"`.

**Step 3: Method Call**
- `readFile(fileName)` is called with `fileName` being `"example.txt"`.

**Inside `readFile` method:**
1. **File Object Creation:**
   - A `File` object is created with the name `"example.txt"`.
   
2. **Scanner Object Creation:**
   - The method attempts to create a `Scanner` object to read the file.

3. **File Not Found Check:**
   - If the file `"example.txt"` does not exist in the directory, a `FileNotFoundException` is thrown.

**Step 4: Exception Handling**
- The `FileNotFoundException` is caught by the `catch` block in the `main` method.
- The message "Exception caught: example.txt (No such file or directory)" is printed to the console.

**Step 5: Finally Block**
- The message "End of file reading process" is printed.

**Step 6: Scanner Closure**
- The input scanner object is closed to free up resources.

**Step 7: Final Message**
- The message "Program ended" is printed.

 Output

The output of the program when the file `"example.txt"` is not found will be:

Enter the file name: example.txt
Exception caught: example.txt (No such file or directory)
End of file reading process
Program ended


If the file `"example.txt"` exists and contains the lines:

Hello, world!
This is a test file.


The output will be:

Enter the file name: example.txt
Hello, world!
This is a test file.
End of file reading process
Program ended



 */
