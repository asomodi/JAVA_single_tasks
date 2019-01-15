/**
* This code reads two Strings (a and b) from the console and prints them mixed together (one char of 'a' is followed by one of 'b').
* Any leftover chars go to the end of the result.
*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String a = scanner1.next();
        System.out.println("Please enter another String: ");
        String b = scanner1.next();
        createMixOfStrings(a, b);
    }

    private static void createMixOfStrings(String a, String b) {
        String longer = "";
        String shorter = "";

        if (a.length() > b.length()) {
            longer = a;
            shorter = b;
        } else {
            longer = b;
            shorter = a;
        }

        int i = 0;
        for (i = 0; i < shorter.length(); i++) {
            System.out.println(b.substring(i, i + 1));
            System.out.println(a.substring(i, i + 1));
        }
        for (int j=i; j<longer.length(); j++){
            System.out.println(longer.substring(j, j + 1));
        }
    }
}
