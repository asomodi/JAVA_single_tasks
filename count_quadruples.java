/*We'll say that a "quadruple" in a string is a char appearing four times in a row. */
/*Print the number of quadruples in the given string. The quadruples may overlap.*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String a = scanner1.nextLine();

        int counter = 0;
        for (int i = 0; i < a.length() - 3; i++) {
            if (a.substring(i, i + 1).equals(a.substring(i + 1, i + 2)) &&
                    a.substring(i + 2, i + 3).equals(a.substring(i + 3, i + 4))) {
                counter++;
            } else {
            }


        }
        System.out.println(counter);
    }
}
