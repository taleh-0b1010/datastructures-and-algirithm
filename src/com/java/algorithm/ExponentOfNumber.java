package com.java.algorithm;

public class ExponentOfNumber {

    public static void main(String[] args) {
        System.out.println(calculateWithRecursive(2, 3));
        System.out.println(calculateWithLoop(2, 3));
    }

    private static int calculateWithRecursive(int a, int b) {
        if (b < 0) {
            return 0; //Error
        } else if (b == 0) {
            return 1;
        } else {
            return a * calculateWithRecursive(a, b - 1);
        }
    }

    private static int calculateWithLoop(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
