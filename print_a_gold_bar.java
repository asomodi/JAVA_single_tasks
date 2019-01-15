/*In this case I drew a gold bar.*/

package com.company;

public class Main {

    public static void main(String[] args) {

        int size = 5;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (i == 0 && j == 0) {
                    System.out.print("/");
                } else if (i == size - 1 && j == size - 1) {
                    System.out.print("/");
                } else if (i == 0 && j == size - 1 || i == size - 1 && j == 0) {
                    System.out.print("\\");
                } else if (i == 0 || i == size - 1) {
                    System.out.print("-");
                } else if (j == 0 || j == size - 1) {
                    System.out.print("|");
                } else if (i == (size - 1) / 2 && j == (size - 1) / 2) {
                    System.out.print("G");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}