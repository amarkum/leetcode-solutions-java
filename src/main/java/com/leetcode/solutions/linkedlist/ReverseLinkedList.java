package com.leetcode.solutions.linkedlist;

/**
 * 206. Reverse Linked List - https://leetcode.com/problems/reverse-linked-list/
 *
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