package com.leetcode.solutions.arrays;

/**
 * 1295. Find Numbers with Even Number of Digits - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
class NumbersWithEvenDigit {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((String.valueOf(nums[i]).length()) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}