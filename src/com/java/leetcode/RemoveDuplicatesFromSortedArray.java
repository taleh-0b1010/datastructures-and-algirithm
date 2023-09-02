package com.java.leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int k = removeDuplicates(new int[]{0, 1, 1, 1, 1, 2, 2, 3, 3, 4});
        System.out.println(k);
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length;) {
            int skip = 1;
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                skip++;
                int next = i + 1;
                nums[next] = 99;
                count++;
                System.out.println("Checking elements at index: " + i + " and " + next + ". Count is " + count);
                int startPoint = i + 2;
                for (int j = startPoint; startPoint < nums.length && j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        skip++;
                        count++;
                        nums[j] = 99;
                        System.out.println("Checking elements at index: " + i + " and " + j + ". Count is " + count);
                    }
                }
            }
            i = i + skip;
        }
        Arrays.sort(nums);
        return nums.length - count;
    }
}