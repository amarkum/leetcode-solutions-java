package com.leetcode.solutions.strings;

/**
 * 344. Reverse String - https://leetcode.com/problems/reverse-string/
 *
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array in-place with O(1) extra memory.
 */
class ReverseString {
    public void reverseString(char[] s) {
        int mid = s.length/2;
        int i = 0;
        char c;
        for(int j = s.length-1; j>=mid; j--)   {
            c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
        }
    }
}