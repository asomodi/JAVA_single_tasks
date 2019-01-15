/*We call a sequence of identical characters a 'block'. Print the length of the largest 'block' in the given string.*/

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        String word = scanner1.nextLine();


        ArrayList<Integer> allCounters = new ArrayList<>();
        int counter = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.substring(i, i + 1).equals(word.substring(i + 1, i + 2))) {
                counter++;
            } else {
                allCounters.add(counter);
                counter = 1;
            }
        }
        for (int j = 0; j < allCounters.size(); j++) {
            if (allCounters.get(j) > counter) {
                counter = allCounters.get(j);
            }
        }
        System.out.println(counter);
    }
}