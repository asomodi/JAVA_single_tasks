/*This code was made to find all the perfect numbers between 1 and 1000. A perfect number, is a number where all of it's divisors add up to that number.*/

package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 2; i < 10001; i++) {

            int sum = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.println(sum);
            }
        }
    }
}

