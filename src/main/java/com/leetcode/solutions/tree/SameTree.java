package com.leetcode.solutions.tree;

/**
 * 100. Same Tree - https://leetcode.com/problems/same-tree/
 *
 * Given two binary trees, write a function to check if they are the same or not.
 */
class SameTree {
    // set the isSame flag as true in the beginning
    boolean isSame = true;

    // Do an In Order Traversal for both the trees
    public boolean isSameTree(TreeNode p, TreeNode q) {
        dfsBothTree(p, q);
        return isSame;
    }

    public void dfsBothTree(TreeNode p, TreeNode q) {

        // If both of them are null, return as we traversed the entire tree
        if (p == null && q == null) {
            return;
        }

        // If P is null and Q is not, return it, as they are not the same
        if (p == null && q != null) {
            isSame = false;
            return;
        }

        // If Q is null and P is not, return it, as they are not the same
        if (q == null && p != null) {
            isSame = false;
            return;
        }

        isSameTree(p.left, q.left);
        // If the value does not match at any point of time, set isSame as false and return
        if (p.val != q.val) {
            isSame = false;
            return;
        }
        isSameTree(p.right, q.right);
    }
}
