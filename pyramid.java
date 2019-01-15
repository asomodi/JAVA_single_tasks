/*An example to print a pyramid pattern.*/

package com.company;

public class Main {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (j < n - (i - 1)) {
                    System.out.print(" ");
                }
                if (j >= n - (i - 1) && j <= n + (i - 1)) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

