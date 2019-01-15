/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter: ");

        int arraySize = input.nextInt();
        int[] array = new int[arraySize];

        System.out.println("Please enter the numbers: ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = 0; j < arraySize - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("The correct sequence is: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.println(array[i]);

        }
    }
}