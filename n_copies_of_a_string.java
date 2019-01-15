/*This code reads a string and an int (n) from the console, then returns a String that is n copies of the original String.*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        String str1 = scanner1.nextLine();
        int n = scanner1.nextInt();

        StringBuilder stbuild = new StringBuilder(n * n);
        String last = str1.substring(str1.length() - n);
        for (int i = 0; i < n; i++)
            stbuild.append(last);
        System.out.println(stbuild.toString());

    }
}
