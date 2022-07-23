package com.java.algorithm.search;

public class LinearSearch {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(search(intArray, -15));
        System.out.println(search(intArray, 22));
    }

    private static int search(int[] intArray, int value) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
