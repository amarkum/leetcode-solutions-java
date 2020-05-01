package com.leetcode.solutions.linkedlist;

/**
 * Given a linked list, determine if it has a cycle in it.
 */
public class LinkedListCycleDetect {
    public boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}