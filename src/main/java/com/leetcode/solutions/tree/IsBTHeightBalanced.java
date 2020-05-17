package com.leetcode.solutions.tree;

/**
 * 110. Balanced Binary Tree - https://leetcode.com/problems/balanced-binary-tree/
 *
 * Given a binary tree, determine if it is height-balanced.
 */
class IsBTHeightBalanced {
    public boolean isBalanced(TreeNode root) {
        int left;
        int right;
        if (root == null) {
            return true;
        }

        // Find the height of the tree at the left and the right
        left = findDepth(root.left);
        right = findDepth(root.right);

        /**
         * We the Absolute difference is equal to less than 1 or equal, it is balanced.
         * Also, we have to make sure the children also follows the same prooperty
         */
        if (Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }
        return false;
    }

    // Helper method to find height or depth of a tree
    public int findDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return (1 + Math.max(findDepth(node.left), findDepth(node.right)));
    }
}