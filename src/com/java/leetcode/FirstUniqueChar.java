package com.java.leetcode;

import java.util.Arrays;

public class FirstUniqueChar {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    private static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return i;
            }
        }
        return -1;
    }
}
