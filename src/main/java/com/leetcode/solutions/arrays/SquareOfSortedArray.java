package com.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 977. Squares of a Sorted Array - https://leetcode.com/problems/squares-of-a-sorted-array/
 *
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number,
 * also in sorted non-decreasing order.
 */
class SquareOfSortedArray {
    public int[] sortedSquares(int[] A) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < A.length; i++) {
            list.add((A[i] * A[i]));
        }
        Collections.sort(list);

        for (int i = 0; i < A.length; i++) {
            A[i] = list.get(i);
        }
        return A;
    }
}