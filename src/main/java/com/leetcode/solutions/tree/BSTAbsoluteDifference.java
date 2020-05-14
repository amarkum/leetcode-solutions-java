package com.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 530. Minimum Absolute Difference in BST
 *
 * Given a binary search tree with non-negative values,
 * find the minimum absolute difference between values of any two nodes.
 */
public class BSTAbsoluteDifference {
    List<Integer> treeValues = new ArrayList<Integer>();

    public int getMinimumDifference(TreeNode root) {

        // get the elements of the tree in sorted order using In Order Traversal
        dfsInOrder(root);

        // find the Minimum Absolute Difference
        int absoluteDifference = Integer.MAX_VALUE;
        for (int i = 1; i < treeValues.size(); i++) {
            // assign the new absolute difference, Minimum from intermediate difference, and absolute Difference
            absoluteDifference = Math.min(treeValues.get(i) - treeValues.get(i - 1), absoluteDifference);
        }
        return absoluteDifference;
    }

    public void dfsInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        dfsInOrder(node.left);
        treeValues.add(node.val);
        dfsInOrder(node.right);
    }
}