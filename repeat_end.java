/*Given a string and an int n, print a string made of n+1 repetitions of the last n characters of the string.*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        String newWord = scanner1.nextLine();
        int n = scanner1.nextInt();

        for (int i = 0; i < (n + 1); i++) {
            newWord = newWord.substring(newWord.length() - n);

            System.out.print(newWord);


        }
    }
}
