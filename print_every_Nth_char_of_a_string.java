/*Given a non-empty string and an int N, return the string made starting with char 0, and then
every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int N = scanner.nextInt();

        String newstr = "";
        for (int i = 0; i < str.length(); i = i + N) {
            if (N >= 1) {
                newstr = newstr + str.charAt(i);
            }

        }
        System.out.println(newstr);
    }
}





