package com.leetcode.solutions.arrays;

/**
 * 905. Sort Array By Parity - https://leetcode.com/problems/sort-array-by-parity/
 *
 * Given an array A of non-negative integers,
 * return an array consisting of all the even elements of A, followed by all the odd elements of A.
 */
class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {

        int[] output = new int[A.length];
        int evenNumbers = 0;

        for (int i = 0; i < A.length; i++) {
            if ((A[i] % 2) == 0) {
                output[evenNumbers++] = A[i];
            }
        }

        for (int i = 0; i < A.length; i++) {
            if ((A[i] % 2) != 0) {
                output[evenNumbers++] = A[i];
            }
        }
        return output;
    }
}