package com.leetcode.solutions.arrays;

/**
 * 1480. Running Sum of 1d Array - https://leetcode.com/problems/running-sum-of-1d-array/
 *
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 */
public class SumOfArray {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};
        for (int element : runningSum(values)) {
            System.out.println(element);
        }
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i<nums.length; i++) {
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
