package com.leetcode.solutions.tree;

/**
 * 437. Path Sum III - https://leetcode.com/problems/path-sum-iii/
 * <p>
 * You are given a binary tree in which each node contains an integer value.
 * Find the number of paths that sum to a given value.
 */

class PathSumII {
    int totalPath = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return totalPath;
        }
        // Call the find path method, send 0 and if the value is returned equal to sum, increment totalPath
        findPath(root, sum, 0);

        // Check each and every node recursively, and call the same method to find the path
        pathSum(root.left, sum);
        pathSum(root.right, sum);

        return totalPath;

    }

    public void findPath(TreeNode node, int sum, int currentSum) {
        if (node == null) {
            return;
        }
        currentSum += node.val;
        if (currentSum == sum) {
            totalPath++;
        }

        findPath(node.left, sum, currentSum);
        findPath(node.right, sum, currentSum);
    }

}