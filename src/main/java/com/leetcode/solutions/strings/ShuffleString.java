package com.leetcode.solutions.strings;

/**
 * 1528. Shuffle String - https://leetcode.com/problems/shuffle-string/
 *
 * Given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 *
 * Return the shuffled string.
 */
class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] newString = new char[indices.length];
        for(int i=0; i<s.length(); i++){
            newString[indices[i]] = s.charAt(i);
        }
        return String.valueOf(newString);
    }
}