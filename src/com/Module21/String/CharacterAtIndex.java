package com.Module21.String;

import java.util.Scanner;

public class CharacterAtIndex {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// Ask user to enter string
		System.out.println("Enter a String");
		String string=sc.nextLine();
		
		// Ask user to enter an index
		System.out.println("Enter an index");
		int index=sc.nextInt();
		
		// Check if the index is valid
		if(index >= 0 && index < string.length())
		{
			// Get the character at the specified index
			char character=string.charAt(index);
			System.out.println("Character at index "+index+" is : "+character);
		}
		else
		{
			System.out.println("Invalid index");
		}
		
		sc.close();
	}

}

/* dry run of the program with an example:

Suppose we run the program and input the following:


Enter a string: Hello World
Enter an index: 6


1. The program asks the user to enter a string. The user inputs "Hello World".
2. The program asks the user to enter an index. The user inputs 6.
3. The program checks if the index (6) is within the bounds of the string "Hello World". The length of the string is 11, so the index is valid.
4. The program retrieves the character at index 6 in the string "Hello World". Since Java uses 0-based indexing, the character at index 6 is 'W'.
5. The program prints: "Character at index 6 is: W".

So, the output of the program would be:

Character at index 6 is: W

*/