package com.leetcode.solutions.strings;

/**
 * 1374. Generate a String With Characters That Have Odd Counts -
 * https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
 *
 * Given an integer n,
 * return a string with n characters such that each character in such string occurs an odd number of times.
 * The returned string must contain only lowercase English letters. If there are multiples valid strings,
 * return any of them.
 */
class OddCharacters {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();

        char a = 'p';
        char b = 'z';
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                sb.append(a);
            }
            sb.append(b);
        } else {
            for (int i = 0; i < n; i++) {
                sb.append(a);
            }
        }
        return sb.toString();
    }
}