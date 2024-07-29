package com.Module21.String;

import java.util.Scanner;

public class StringCompareToSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt user to enter the character sequence to compare
        System.out.print("Enter the character sequence to compare: ");
        String sequence = scanner.nextLine();

        // Compare the string to the specified character sequence
        int result = inputString.compareTo(sequence);

        // Print the result
        if (result == 0) {
            System.out.println("The string is equal to the specified character sequence.");
        } else if (result < 0) {
            System.out.println("The string is lexicographically less than the specified character sequence.");
        } else {
            System.out.println("The string is lexicographically greater than the specified character sequence.");
        }

        scanner.close();
    }
}

/*
Let's do a dry run of the program:

Suppose we run the program and input the following:


Enter a string: apple
Enter the character sequence to compare: banana


1. The program prompts the user to enter a string. The user inputs "apple".
2. The program prompts the user to enter the character sequence to compare. The user inputs "banana".
3. The program compares the string "apple" to the character sequence "banana" using the `compareTo()` method.
4. Since "apple" comes before "banana" lexicographically, the result of the comparison is negative.
5. The program prints: "The string is lexicographically less than the specified character sequence."

So, the output of the program would be:

The string is lexicographically less than the specified character sequence.

*/