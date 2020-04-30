package com.leetcode.solutions.linkedlist;

/**
 * Reverse a singly linked list.
 */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode previousNode = null;
        ListNode current = head;
        ListNode nextNode = null;

        while (current != null) {
            nextNode = current.next;
            current.next = previousNode;
            previousNode = current;
            current = nextNode;
        }
        return previousNode;
    }
}