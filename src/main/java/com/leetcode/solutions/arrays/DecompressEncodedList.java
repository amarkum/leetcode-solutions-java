package com.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *  1313. Decompress Run-Length Encoded List - https://leetcode.com/problems/decompress-run-length-encoded-list/
 *
 *  We are given a list nums of integers representing a list compressed with run-length encoding.
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
 * For each such pair, there are freq elements with value val concatenated in a sublist.
 * Concatenate all the sublists from left to right to generate the decompressed list.
 *
 * Return the decompressed list.
 */
class DecompressEncodedList {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }
        int[] output = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            output[k] = list.get(k);
        }
        return output;
    }
}