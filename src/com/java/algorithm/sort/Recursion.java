package com.java.algorithm.sort;

/**
 * Taleh Gurbanzade
 */
public class Recursion {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(4));
    }

    private static int recursiveFactorial(int number) {
        if (number == 0) {
            return 1;
        }

        return number * recursiveFactorial(number - 1);
    }
}
