package com.java.leetcode;

/**
 * Approach: Bit Manipulation
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a = a ^ i;
        }
        return a;
    }
}
