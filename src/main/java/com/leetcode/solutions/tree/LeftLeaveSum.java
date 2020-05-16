package com.leetcode.solutions.tree;

/**
 * 404. Sum of Left Leaves - https://leetcode.com/problems/sum-of-left-leaves/
 *
 * Find the sum of all left leaves in a given binary tree.
 */
class LeftLeaveSum {
    public int leftLeavesSum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return leftLeavesSum;
        leftSum(root, root);
        return leftLeavesSum;
    }

    // Perform an InOrder Traversal
    public void leftSum(TreeNode node, TreeNode parent) {

        if (node == null) {
            return;
        }

        leftSum(node.left, node);

        // Check if the node is left child and a leaf node
        if (node.left == null && node.right == null && parent.left == node) {
            leftLeavesSum += node.val;
        }

        leftSum(node.right, node);
    }
}