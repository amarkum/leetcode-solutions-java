package com.leetcode.solutions.arrays;

/**
 * 1299. Replace Elements with Greatest Element on Right Side - https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 *
 * Given a m * n matrix grid which is sorted in non-increasing order both row-wise and column-wise.
 * Return the number of negative numbers in grid.
 */
class ReplaceWithGreaterRight {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = maxValue(arr, i + 1);
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public int maxValue(int arr[], int start) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}