package com.java.leetcode;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o','x','x','u'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    private static void reverseString(char[] s) {
        char temp;
        int lastIndex = s.length - 1;
        for (int i = 0; i <= s.length / 2 - 1; i++) {
            temp = s[i];
            s[i] = s[lastIndex - i];
            s[lastIndex - i] = temp;
        }
    }
}
