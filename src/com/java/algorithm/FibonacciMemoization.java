package com.java.algorithm;

public class FibonacciMemoization {

    public static void main(String[] args) {
        allFibonacci(5);
    }

    private static void allFibonacci(int n) {
        int[] memo = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + fibonacci(i, memo));
        }
    }

    private static int fibonacci(int n, int[] memo) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memo[n] > 0) return memo[n];
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }
}
