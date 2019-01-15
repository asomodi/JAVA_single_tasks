/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
/*Given a string A, print 'Yes' if it is a palindrome, print 'No' otherwise.
* */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String s = scanner1.nextLine();


        boolean palindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                palindrome = false;
            }
        }

        if (palindrome == true) System.out.println("Yes");
        else System.out.println("No");
    }
}

