package com.inputoutput;

//file to console
//file is implementing serializable and serializable is markerinterface and thats why file will convert object in to byte stream

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {

	public static void main(String[] args) throws IOException  {
		
		File f=new File("Input.txt");
		
		FileReader fr=new FileReader(f);
		
		BufferedReader br=new BufferedReader(fr);
		
		String line;
		
		while((line=br.readLine()) !=null)
		{
			System.out.println(line);
		}
		
		fr.close();

	}

}

/*
Sure, let's do a dry run of the provided Java program step by step:

1. **Import Statements**:
   ```java
   package com.demo;

   import java.io.BufferedReader;
   import java.io.File;
   import java.io.FileNotFoundException;
   import java.io.FileReader;
   import java.io.IOException;
   ```

   Here, the necessary packages are imported for file handling in Java, such as `BufferedReader`, `File`, `FileNotFoundException`, `FileReader`, and `IOException`.

2. **Main Class Declaration**:
   ```java
   public class ReadTest {
   ```

   The main class `ReadTest` is declared, encapsulating the functionality of the program.

3. **Main Method**:
   ```java
   public static void main(String[] args) throws IOException {
   ```

   The main method is declared with a `throws IOException` clause, indicating that this method may throw an `IOException`, and it's the responsibility of the calling method to handle it.

4. **File Initialization**:
   ```java
   File f1=new File("input.txt");
   ```

   A new `File` object named `f1` is created with the file name `"input.txt"`. This file is expected to be in the current directory of the program.

5. **FileReader Initialization**:
   ```java
   FileReader reader=new FileReader(f1);
   ```

   A `FileReader` object named `reader` is created, which will read from the file represented by `f1`.

6. **BufferedReader Initialization**:
   ```java
   BufferedReader br=new BufferedReader(reader);
   ```

   A `BufferedReader` object named `br` is created, wrapping around the `FileReader` object `reader`. This allows efficient reading of text from the file.

7. **Reading File Content**:
   ```java
   String line;
   while((line=br.readLine()) != null)
   {
       System.out.println(line);
   }
   ```

   Inside a `while` loop, each line of the file is read using the `readLine()` method of `BufferedReader`. If the line read is not `null`, it's printed to the console using `System.out.println()`. The loop continues until the end of the file is reached (i.e., `readLine()` returns `null`).

8. **End of Program**:
   The program execution finishes after all lines of the file have been read and printed.

This program essentially reads the contents of a file named `"input.txt"` and prints each line to the console.*/