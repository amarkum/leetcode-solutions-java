package com.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 1431. Kids With the Greatest Number of Candies - https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 *
 * For each kid check if there is a way to distribute extraCandies among the kids such that,
 * he or she can have the greatest number of candies among them.
 * Notice that multiple kids can have the greatest number of candies.
 *
 */
class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        int max = findMax(candies);

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                output.add(true);
            } else {
                output.add(false);
            }
        }
        return output;
    }

    public int findMax(int[] candies) {
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        return max;
    }
}