package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.printOddNumbers();
        arrayPractice.splitString();
        arrayPractice.splitStringIntoSentences();

    }

    public void printOddNumbers() {
        int[] myArrayOfInts = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < myArrayOfInts.length; i++) {
            if (myArrayOfInts[i] % 2 == 1) {
                System.out.println(myArrayOfInts[i]);
            }

        }
    }

    public String[] splitString() {
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. Use the split";
        String[] greenEggsArray = greenEggs.split(" ");
       // System.out.println(Arrays.toString(greenEggsArray));
        return greenEggsArray;
    }

    public void splitStringIntoSentences() {
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. Use the split";
        String[] greenEggsArray = greenEggs.split("\\.");
        System.out.println(Arrays.toString(greenEggsArray));
    }
}