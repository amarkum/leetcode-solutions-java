package com.leetcode.solutions.linkedlist;

/**
 * 203. Remove Linked List Elements - https://leetcode.com/problems/remove-linked-list-elements/
 *
 * Remove all elements from a linked list of integers that have value val.
 */
class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {


        while(head !=null && head.val == val){
            head = head.next;
        }

        ListNode current = head;
        while (current != null && current.next != null) {
            if(current.next.val == val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }

        return head;
    }
}