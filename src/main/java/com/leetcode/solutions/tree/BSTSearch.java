package com.leetcode.solutions.tree;

/**
 * 700. Search in a Binary Search Tree - https://leetcode.com/problems/search-in-a-binary-search-tree/
 *
 * Given the root node of a binary search tree (BST) and a value.
 * You need to find the node in the BST that the node's value equals the given value.
 * Return the subtree rooted with that node.
 * If such node doesn't exist, you should return NULL.
 */
class BSTSearch {
    public TreeNode searchBST(TreeNode root, int val) {

        TreeNode currentNode = root;

        while (currentNode != null) {
            if (currentNode.val == val) {
                return currentNode;
            } else if (currentNode.val > val) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        return null;
    }
}