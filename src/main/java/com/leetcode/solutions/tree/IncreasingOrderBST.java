package com.leetcode.solutions.tree;

import java.util.LinkedList;

/**
 * 897. Increasing Order Search Tree - https://leetcode.com/problems/increasing-order-search-tree/
 * <p>
 * Given a binary search tree,
 * rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree,
 * and every node has no left child and only 1 right child.
 */
class IncreasingOrderBST {
    LinkedList<Integer> values = new LinkedList();

    public TreeNode increasingBST(TreeNode root) {

        inOrder(root);

        TreeNode outputTree = new TreeNode();
        TreeNode currentNode = outputTree;

        // From LinkedList, for the Increasing Order Tree, PollFirst() does FIFO
        while (!values.isEmpty()) {
            currentNode.right = new TreeNode(values.pollFirst());
            currentNode = currentNode.right;
        }
        return outputTree.right;
    }

    /**
     * Add the Values to the LinkedList in Sorted and Ascending Order
     * @param root
     */
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        values.add(root.val);
        inOrder(root.right);

    }
}