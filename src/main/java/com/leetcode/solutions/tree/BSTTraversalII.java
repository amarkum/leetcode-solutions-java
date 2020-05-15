package com.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 107. Binary Tree Level Order Traversal II - https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 * <p>
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 */
class BSTTraversalII {
    LinkedList<List<Integer>> listOrder = new LinkedList<List<Integer>>();
    LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if (root == null) {
            return listOrder;
        }

        // Add the root to the stack
        stack.add(root);

        // Unless stack is Empty iterate
        while (!stack.isEmpty()) {
            int size = stack.size();

            // Create a list to store all the values of the level
            List<Integer> elements = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                // Poll and keep adding it to the list
                TreeNode node = stack.pollFirst();
                elements.add(node.val);

                // If the tree has values in left and right, then only add it to the stack
                if (node.left != null) {
                    stack.addLast(node.left);
                }
                if (node.right != null) {
                    stack.addLast(node.right);
                }
            }
            // Add up all the list, one ahead of another
            listOrder.addFirst(elements);
        }
        return listOrder;
    }
}