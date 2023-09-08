package com.java.leetcode;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result1 = Solution1.addTwoNumbers(l1, l2);
        ListNode result2 = Solution2.addTwoNumbers(l1, l2);
    }

    private static class Solution2 {
        static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode curr = dummyHead;
            int carry = 0;
            while (l1 != null || l2 != null || carry != 0) {
                int x = (l1 != null) ? l1.val : 0;
                int y = (l2 != null) ? l2.val : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (l1 != null)
                    l1 = l1.next;
                if (l2 != null)
                    l2 = l2.next;
            }
            return dummyHead.next;
        }
    }

    private static class Solution1 {

        static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            StringBuilder s1 = new StringBuilder();
            while (l1.next != null) {
                s1.insert(0, l1.val);
                l1 = l1.next;
            }
            s1.insert(0, l1.val);
            long long1 = Long.parseLong(String.valueOf(s1));

            StringBuilder s2 = new StringBuilder();
            while (l2.next != null) {
                s2.insert(0, l2.val);
                l2 = l2.next;
            }
            s2.insert(0, l2.val);
            long long2 = Long.parseLong(String.valueOf(s2));

            long result = long1 + long2;
            String resultString = String.valueOf(result);
            ListNode resultNode = new ListNode(Integer.parseInt(resultString.charAt(0) + ""));
            for (int i = 1; i <= resultString.length() - 1; i++) {
                char charAt = resultString.charAt(i);
                int integer = Integer.parseInt(charAt + "");
                resultNode = new ListNode(integer, resultNode);
            }
            return resultNode;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
