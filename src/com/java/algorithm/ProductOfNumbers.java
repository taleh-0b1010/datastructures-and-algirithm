package com.java.algorithm;

public class ProductOfNumbers {

    public static void main(String[] args) {
        System.out.println(calculate(5, 3));
    }

    private static int calculate(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }
}
