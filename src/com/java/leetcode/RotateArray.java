package com.java.leetcode;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int k = 3;
        int[] nums1 = new int[]{1,2,3,4,5,6,7};
        Solution1.rotate(nums1, k);
        int[] nums2 = new int[]{1,2,3,4,5,6,7};
        Solution2.rotate(nums2, k);
    }


    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    static class Solution2 {

        static void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
            System.out.println(Arrays.toString(nums));
        }

        private static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }

    /**
     * Time complexity: O(n*k). Not good enough
     * Space complexity: O(1)
     */
    static class Solution1 {

        static void rotate(int[] nums, int k) {
            for (int i = 0; i < k; i++) {
                for (int j = nums.length - 1; j >= 0; j--) {
                    if (j - 1 >= 0) {
                        int elementAtJ = nums[j];
                        nums[j] = nums[j - 1];
                        nums[j - 1] = elementAtJ;
                    }
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
