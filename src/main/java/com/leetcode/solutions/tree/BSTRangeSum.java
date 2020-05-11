package com.leetcode.solutions.tree;

/**
 * Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
 * The binary search tree is guaranteed to have unique values.
 */
class BSTRangeSum {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        parseNode(root, L, R);
        return sum;
    }

    public void parseNode(TreeNode node, int L, int R) {
        if (node == null) {
            return;
        }

        if (node.val >= L && node.val <= R) {
                sum += node.val;
        }

        if(node.val > L) {
            parseNode(node.left, L, R);
        }

        if(node.val < R) {
            parseNode(node.right, L, R);
        }
    }
}