/*Given an array of ints, print 'true' if the number of '1's is fewer than the number of '4's.*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double[] numbers = new double[num];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        int oneCount = 0;
        int fourCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                oneCount++;
            } else if (numbers[i] == 4) {
                fourCount++;
            }
        }
        if (oneCount < fourCount) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
