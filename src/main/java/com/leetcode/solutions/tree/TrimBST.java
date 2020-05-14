package com.leetcode.solutions.tree;

/**
 * 669. Trim a Binary Search Tree - https://leetcode.com/problems/trim-a-binary-search-tree/
 *
 * Given a binary search tree and the lowest and highest boundaries as L and R,
 * trim the tree so that all its elements lies in [L, R] (R >= L).
 * You might need to change the root of the tree,
 * so the result should return the new root of the trimmed binary search tree.
 */
class TrimBST {
    public TreeNode trimBST(TreeNode root, int L, int R) {

        // Base condition
        if (root == null) return root;

        // based on the condition it should ask the child node
        if (root.val > R) return trimBST(root.left, L, R);
        if (root.val < L) return trimBST(root.right, L, R);

        // set the correct, left and right value doing a DFS
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}