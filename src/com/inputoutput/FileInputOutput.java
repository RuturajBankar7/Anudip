package com.inputoutput;

import java.io.File;

//File to file
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file1=new File("Input.txt");
		File file2=new File("Output.txt");
		
		FileReader reader=new FileReader(file1);
		FileWriter writer=new FileWriter(file2);
		
		int ch;
		
		while((ch=reader.read()) !=-1)
		{
			writer.write(ch);
		}
		
		reader.close();
		writer.close();

	}

}

/*In the 6th step, the condition `(ch=reader.read()) != -1` is used to check whether the end of the file has been reached. Let's break down what's happening here:

- The `read()` method of `FileReader` reads a single character from the input file and returns it as an integer. If the end of the file is reached, it returns -1.
- So, `(ch=reader.read())` assigns the next character read from the file to the variable `ch`.
- The condition `(ch != -1)` checks whether the value of `ch` is not equal to -1, indicating that a character was successfully read.
- If the condition is true, meaning a character was read and it's not the end of the file, the character is written to the output file.
- The loop continues until `reader.read()` returns -1, indicating that the end of the file has been reached.

So, the `-1` is used as a sentinel value to signify the end of the file. When `read()` returns -1, it indicates that there are no more characters to read from the file.*/

/*Let's walk through a dry run of the provided Java program step by step:

1. **Import Statements**:
   ```java
   import java.io.File;
   import java.io.FileNotFoundException;
   import java.io.FileReader;
   import java.io.FileWriter;
   import java.io.IOException;
   ```

   Necessary packages for file handling in Java are imported.

2. **Main Class Declaration**:
   ```java
   public class FileInputOutput {
   ```

   The main class `FileInputOutput` is declared, encapsulating the functionality of the program.

3. **Main Method**:
   ```java
   public static void main(String[] args) throws IOException {
   ```

   The main method is declared with a `throws IOException` clause, indicating that this method may throw an `IOException`, and it's the responsibility of the calling method to handle it.

4. **File Initialization**:
   ```java
   File file1=new File("input.txt");
   File file2=new File("output.txt");
   ```

   Two `File` objects `file1` and `file2` are created representing input and output files, respectively.

5. **FileReader and FileWriter Initialization**:
   ```java
   FileReader reader=new FileReader(file1);
   FileWriter writer=new FileWriter(file2);
   ```

   A `FileReader` object `reader` is created to read from `file1`, and a `FileWriter` object `writer` is created to write to `file2`.

6. **Copying Content from Input File to Output File**:
   ```java
   int ch;
   while((ch=reader.read())!=-1)
   {
       writer.write(ch);
   }
   ```

   Inside a `while` loop, each character of the input file (`file1`) is read using `reader.read()`, and if it's not the end of the file (`-1`), the character is written to the output file (`file2`) using `writer.write(ch)`.

7. **Closing Reader and Writer**:
   ```java
   reader.close();
   writer.close();
   ```

   After copying is done, both the `FileReader` and `FileWriter` are closed to release system resources.

8. **End of Program**:
   Finally, a message "Copy hua" is printed to indicate that the copying process is completed.

This program essentially copies the content from a file named `"input.txt"` to another file named `"output.txt"`.*/
