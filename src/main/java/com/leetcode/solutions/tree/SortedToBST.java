package com.leetcode.solutions.tree;

/**
 * 108. Convert Sorted Array to Binary Search Tree - https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
class SortedToBST {
    public TreeNode sortedArrayToBST(int[] nums) {

        int size = nums.length;
        if (size == 0) {
            return null;
        }
        return constructTree(nums, 0, size - 1);
    }

    public TreeNode constructTree(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }

        int middlePoint = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[middlePoint]);

        node.left = constructTree(nums, left, middlePoint - 1);
        node.right = constructTree(nums, middlePoint + 1, right);

        return node;
    }
}