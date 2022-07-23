package com.java.algorithm.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(iterativeSearch(intArray, 20));
        System.out.println(iterativeSearch(intArray, 55));

        System.out.println(recursiveSearch(intArray, 1));
        System.out.println(recursiveSearch(intArray, -22));
    }

    private static int iterativeSearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }

    private static int recursiveSearch(int[] input, int value) {
        return recursiveSearch(input, 0, input.length, value);
    }

    private static int recursiveSearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;
        if (input[midpoint] == value) {
            return midpoint;
        } else if (input[midpoint] < value) {
            return recursiveSearch(input, midpoint + 1, end, value);
        } else {
            return recursiveSearch(input, start, midpoint, value);
        }
    }
}
