package com.leetcode.solutions.linkedlist;

/**
 * 1290. Convert Binary Number in a Linked List to Integer
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 *
 * Given head which is a reference node to a singly-linked list.
 * The value of each node in the linked list is either 0 or 1.
 * The linked list holds the binary representation of a number.
 * Return the decimal value of the number in the linked list.
 */

class BinaryToDecimal {
    public int getDecimalValue(ListNode head) {

        String binaryNumber = "";
        ListNode headNode = head;

        while (headNode != null) {
            binaryNumber = binaryNumber + headNode.val;
            headNode = headNode.next;
        }
        // Converts the binary string to decimal, base 2
        return Integer.parseInt(binaryNumber, 2);
    }
}
