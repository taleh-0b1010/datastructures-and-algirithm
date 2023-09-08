package com.java.leetcode;

public class RepeatedSubstring {

    public static void main(String[] args) {
        String s = "012012";
        System.out.println(repeatedSubstringPattern(s));
    }

    private static boolean repeatedSubstringPattern(String s) {

        String t = s + s;
        System.out.println("t: " + t);
        String s1 = t.substring(1, t.length() - 1);
        System.out.println("s1: " + s1);
        if (t.substring(1, t.length() - 1).contains(s))
            return true;


        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.charAt(0) != s.charAt(i)) {
                continue;
            }
            if (s.charAt(i - 1) != s.charAt(s.length() - 1)) {
                continue;
            }
            if (s.length() % i != 0) {
                continue;
            }
            String sub = s.substring(0, i);
            StringBuilder sb = new StringBuilder();
            while (sb.length() <= s.length()) {
                sb.append(sub);
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
