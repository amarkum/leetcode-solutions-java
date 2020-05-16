package com.leetcode.solutions.tree;

/**
 * 111. Minimum Depth of Binary Tree - https://leetcode.com/problems/minimum-depth-of-binary-tree/
 *
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */

import java.util.Stack;

class MinimumDepthBT {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    int minDepth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        preOrderDFS(root);
        return minDepth;
    }

    public void preOrderDFS(TreeNode node) {
        if (node == null) {
            return;
        }
        stack.push(node);

        // Find all the Individual Path, select the minimum size of the path and re-assign it
        if (node.left == null && node.right == null) {
            minDepth = Math.min(minDepth, stack.size());
        }

        preOrderDFS(node.left);
        preOrderDFS(node.right);

        stack.pop();
    }

}