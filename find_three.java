/*Given an array of ints, print 'false' if the value '3' appears in the array exactly 3 times
/*and no '3's are next to each other. Otherwise print 'true'.*/

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
        int counter = 0;
        boolean findThree = true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                counter++;
            }
            if (counter == 3 && numbers[i] == 3 && numbers[i - 1] != 3) {
                findThree = false;

            }
        }
        System.out.println(findThree);

    }
}
