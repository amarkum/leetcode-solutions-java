package com.leetcode.solutions.arrays;

/**
 * 1464. Maximum Product of Two Elements in an Array - https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 *
 *  Given the array of integers nums, you will choose two different indices i and j of that array.
 *  Return the maximum value of (nums[i]-1)*(nums[j]-1).
 */
public class MaxProduct {
        public int maxProduct(int[] nums) {
            int fInd=0;
            int sInd=0;

            int maximum = Integer.MIN_VALUE;

            for(int i=0; i<nums.length;i++){
                for(int j=i+1; j<nums.length; j++){
                    int value = ((nums[i]-1) * (nums[j]-1));
                    if(value>maximum){
                        maximum=value;
                    }
                }
            }
            return maximum;
        }
    }