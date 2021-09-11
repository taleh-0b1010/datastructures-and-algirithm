package com.java.algorithm.sort;

import java.util.Arrays;

/**
 * Taleh Qurbanzada
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int indexOfLargest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[indexOfLargest]) {
                    indexOfLargest = i;
                }
            }
            swap(intArray, indexOfLargest, lastUnsortedIndex);
        }

        System.out.println(Arrays.toString(intArray));
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
