package com.leetcode.solutions.linkedlist;

public class IntersectionOfLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // If anyone of the Node has no value, immediately return null
        if (headA == null || headB == null) return null;

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {

            /**
             *   If the pointer has reached end, point to head of another LinkedList
             *    else increment the pointer
             */
            if (pointerA == null) {
                pointerA = headB;
            } else {
                pointerA = pointerA.next;
            }

            if (pointerB == null) {
                pointerB = headA;
            } else {
                pointerB = pointerB.next;
            }

        }
        return pointerA;
    }
}