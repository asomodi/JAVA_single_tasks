/*We call a sequence of identical characters a 'block'. Print the length of the largest 'block' in the given string.*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String a = scanner1.next();

        if (a.length() == 0) System.out.println(0);

        int max = 0;
        for (int i = 0; i < a.length(); i++) {
            int count = 0;
            for (int j = i; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }

}