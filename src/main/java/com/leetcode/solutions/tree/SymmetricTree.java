package com.leetcode.solutions.tree;

/**
 * 101. Symmetric Tree - https://leetcode.com/problems/symmetric-tree/
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2){

        // If the tree is traversed completely return true.
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;

        /**
         * Assign left part to one tree & right part to another tree,
         *  also assign right part to it, and check if these are equal recursively
         * */

        return (t1.val == t2.val && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left));
    }
}