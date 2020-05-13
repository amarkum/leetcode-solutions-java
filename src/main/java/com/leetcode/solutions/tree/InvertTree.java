package com.leetcode.solutions.tree;

/**
 * 226. Invert Binary Tree - https://leetcode.com/problems/invert-binary-tree/
 *
 * Invert a binary tree.
 * This problem was inspired by this original tweet by Max Howell:
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return root;
        }

        // get the left and right child recursively
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // swap the children of the node
        root.right = left;
        root.left = right;

        return root;
    }
}