package com.java.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1,2,3,4,5,6,7,4};
        System.out.println(Solution1.containsDuplicate(nums1));

        int[] nums2 = new int[]{1,2,3,4,5,6,7,4};
        System.out.println(Solution2.containsDuplicate(nums2));
    }

    /**
     * Time complexity: O(n * log n)
     * Space complexity: O(1)
     */
    static class Solution1 {

        static boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums[i + 1]) {
                    return true;
                }
            }
            return false;
        }
    }


    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    static class Solution2 {

        static boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>(nums.length);
            for (int num : nums) {
                if (set.contains(num)) {
                    return true;
                }
                set.add(num);
            }
            return false;
        }
    }
}
