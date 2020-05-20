package com.leetcode.solutions.strings;

/**
 * 709. To Lower Case - https://leetcode.com/problems/to-lower-case/
 *
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 */
class ToLowerCase {
    public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
            if (a[i] >= 'A' && a[i] <= 'Z')
                a[i] = (char) (a[i] + 32);
        return new String(a);
    }
}
