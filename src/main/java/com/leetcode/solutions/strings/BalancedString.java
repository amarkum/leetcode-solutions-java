package com.leetcode.solutions.strings;

/**
 * 1221. Split a String in Balanced Strings - https://leetcode.com/problems/split-a-string-in-balanced-strings/
 *
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.
 * Given a balanced string s split it in the maximum amount of balanced strings.
 * Return the maximum amount of splitted balanced strings.
 *
 */
class BalancedString {
    public int balancedStringSplit(String s) {

        int lLength = 0;
        int rLength = 0;
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'L') {
                lLength++;
            }
            if (s.charAt(i) == 'R') {
                rLength++;
            }
            if (lLength == rLength) {
                counter++;
                lLength = 0;
                rLength = 0;
            }
        }
        return counter;
    }
}
