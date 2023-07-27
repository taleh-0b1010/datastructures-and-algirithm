package com.java.algorithm.sort;

import java.util.Arrays;

/**
 * Time Complexity O(n+k):
 *      n - number of elements in the array
 *      k - range of elements in the array
 *
 * Good choice if the range of the elements is not greater than the number of elements
 */
public class CountingSort {

    public static void main(String[] args) {

        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 2, 10);

        System.out.println();
        System.out.println(Arrays.toString(intArray));

    }

    private static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;  // [2, 1, 1, 1, 0, 1, 2, 1, 1] in last iteration
            System.out.println(Arrays.toString(countArray));
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
