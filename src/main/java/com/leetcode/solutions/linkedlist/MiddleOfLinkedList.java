package com.leetcode.solutions.linkedlist;

/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * If there are two middle nodes, return the second middle node.
 */
class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}