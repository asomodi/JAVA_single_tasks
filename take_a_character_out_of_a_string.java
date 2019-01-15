/**
* This code reads a String (=word1) and an int (=n) from the console.
* Then it calls a function (=lose1char) that takes the character of the index n out of the String word1 and prints the result.
*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String word1 = scanner1.next();
        
        System.out.println("Please enter a number (not higher than the length of the sentence):");
        int n = scanner1.nextInt();
        
        System.out.println("The result is: " + lose1Char(word1, n));

    }

    private static String lose1Char(String word1, int n) {
        String missingCharBeginning = word1.substring(0, n);
        String missingCharEnd = word1.substring(n + 1, word1.length());
        return missingCharBeginning + missingCharEnd;
    }
}
