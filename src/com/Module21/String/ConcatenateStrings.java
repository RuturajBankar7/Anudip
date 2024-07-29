package com.Module21.String;

import java.util.Scanner;

public class ConcatenateStrings {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// Ask user to enter the first string
		System.out.println("Enter the first string : ");
		String string1=sc.nextLine();
		
		// Ask user to enter the second string
		System.out.println("Enter the Second string : ");
		String string2=sc.nextLine();
		
		// Concatenate the second string to the end of the first string
		String concatenatedString =string1.concat(string2);
		
		// Print the concatenated string
		System.out.println("Concatenated string: " + concatenatedString);
		
		sc.close();
		
			
	}

}


/*
 a dry run of the program with an example:

Suppose we run the program and input the following:


Enter the first string: Hello
Enter the second string: World


1. The program asks the user to enter the first string. The user inputs "Hello".
2. The program asks the user to enter the second string. The user inputs "World".
3. The program concatenates the second string ("World") to the end of the first string ("Hello") using the `concat()` method, resulting in the string "HelloWorld".
4. The program prints: "Concatenated string: HelloWorld".

So, the output of the program would be:
```
Concatenated string: HelloWorld
*/