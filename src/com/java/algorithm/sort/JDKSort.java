package com.java.algorithm.sort;

import java.util.Arrays;

public class JDKSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

//        Arrays.sort(intArray);
        Arrays.parallelSort(intArray);

        System.out.println(Arrays.toString(intArray));
    }
}
