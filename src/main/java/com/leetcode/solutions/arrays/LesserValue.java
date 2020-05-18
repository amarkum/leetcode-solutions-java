package com.leetcode.solutions.arrays;

/**
 * 1365. How Many Numbers Are Smaller Than the Current Number - https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 *
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 */
class LesserValue {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = returnLesserValue(nums, nums[i]);
        }
        return output;
    }

    public int returnLesserValue(int[] nums, int target) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                counter++;
            }
        }
        return counter;
    }

}