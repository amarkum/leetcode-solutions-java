package com.leetcode.solutions.linkedlist;

/**
 * 237. Delete Node in a Linked List - https://leetcode.com/problems/delete-node-in-a-linked-list/
 *
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 */
class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}