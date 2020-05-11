package com.leetcode.solutions.tree;

/**
 * 617. Merge Two Binary Trees - https://leetcode.com/problems/merge-two-binary-trees/
 *
 * You need to merge them into a new binary tree.
 * The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node.
 * Otherwise, the NOT null node will be used as the node of new tree.
 */
class MergeBinaryTree {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        // If t1 is empty return t2
        if (t1 == null) {
            return t2;
        }

        // If t2 is empty return t1
        if (t2 == null) {
            return t1;
        }

        t1.val += t2.val;

        // Traverse all of the node
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        // return the root of the tree
        return t1;
    }
}