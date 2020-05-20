package com.leetcode.solutions.arrays;

/**
 * 1304. Find N Unique Integers Sum up to Zero - https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 *
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 */
class IntegerSumToZero {
    public int[] sumZero(int n) {

        int[] output = new int[n];

        if (n == 1) {
            output[0] = 0;
            return output;
        }

        // Calculates the mid element. E.g 7 - [3-3, 2-2, 1,-1] Add 6 place normally, add 0 if odd
        int x = n / 2;

        if (n % 2 == 0) {
            int i = 0;
            while (i < n) {
                output[i] = x;
                output[i + 1] = -x;
                i += 2;
                x--;
            }
        } else {
            output[0] = 0;
            int i = 1;
            while (i < n) {
                output[i] = x;
                output[i + 1] = -x;
                i += 2;
                x--;
            }
        }

        return output;
    }
}
