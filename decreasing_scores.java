/*Given an array of scores, print 'true' if each score is equal to or lower than the one preceding it.*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextDouble();
        }


        boolean equalOrLower = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] <= arr[i]) {
                equalOrLower = true;
            } else {
                equalOrLower = false;
                break;
            }
        }
        System.out.println(equalOrLower);
    }
}

