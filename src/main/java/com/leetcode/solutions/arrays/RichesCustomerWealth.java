package com.leetcode.solutions.arrays;

/**
 * 1672. Richest Customer Wealth - https://leetcode.com/problems/richest-customer-wealth/
 *
 *You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the in the bank.
 * Return the wealth that the richest customer has.
 *
 * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 */
class RichesCustomerWealth {
    public int maximumWealth(int[][] accounts) {

        int maximum = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            int sum =0;
            for(int j=0; j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            if(maximum<sum){
                maximum=sum;
            }
        }
        return maximum;
    }
}
