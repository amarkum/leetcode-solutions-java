package com.leetcode.solutions.linkedlist;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */
class DeleteDuplicateInSortedList {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
