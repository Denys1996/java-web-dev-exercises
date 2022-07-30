package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        //sumAllEvenValues Method
//        ArrayList<Integer> numbersToSum = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        Integer theTotal = ArrayListPractice.sumAllEvenValues(numbersToSum);
//        System.out.println(theTotal);
        //

        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnWords = arrayPractice.splitString();
        ArrayList<String> randomWords = new ArrayList<>(Arrays.asList(returnWords));
        System.out.println("What word length are you looking for: ");
        Integer searchLength = ArrayListPractice.getUserSearchInput();
        ArrayListPractice.printWordsWithFiveLetters(randomWords, searchLength);
    }

    public static Integer sumAllEvenValues(ArrayList<Integer> valuesToSum) {
        Integer total = 0;
        for (int i = 0; i < valuesToSum.size(); i++) {
            if (valuesToSum.get(i) % 2 == 0) {
                total += valuesToSum.get(i);
            }
        }
        return total;
    }

    public static Integer getUserSearchInput() {
        Scanner scanner = new Scanner(System.in);
        Integer myUserInt = scanner.nextInt();
        scanner.close();
        return myUserInt;
    }
    public static void printWordsWithFiveLetters(ArrayList<String> words, Integer searchLength) {
        for (int i=0; i < words.size(); i++) {
            if(words.get(i).length() == searchLength) {
                System.out.println(words.get(i));
            }
        }
    }
}
