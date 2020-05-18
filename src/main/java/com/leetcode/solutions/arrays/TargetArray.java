package com.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.List;

class TargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<Integer>();
        int length = nums.length;

        for(int i=0; i<length; i++){

            // Adding elements at any index in the arraylist, preserves the rest element, and does not overwrite
            list.add(index[i], nums[i]);
        }
        int[] output = new int[length];
        for(int j=0; j<length; j++){
            output[j] = list.get(j);
        }
        return output;
    }
}