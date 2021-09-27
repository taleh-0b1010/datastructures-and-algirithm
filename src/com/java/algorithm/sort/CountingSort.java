package com.java.algorithm.sort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class CountingSort {

    public static void main(String[] args) {

        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 2, 10);

        System.out.println(Arrays.toString(intArray));

    }

    private static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;  // [0, 2, 1, 1, 0, 0, 1, 2, 1, 1, 0]
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
