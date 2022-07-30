package com.java.datastructure.challange;

import java.util.LinkedList;

public class StackQueuePalindrome {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat i saw?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));
    }

    private static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String lowerCaseString = string.toLowerCase();
        for (int i = 0; i < lowerCaseString.length(); i++) {
            char c = lowerCaseString.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stack.push(c);
                queue.addLast(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }
        return true;
    }
}
