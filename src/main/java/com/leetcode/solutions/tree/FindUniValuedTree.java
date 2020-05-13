package com.leetcode.solutions.tree;

import java.util.LinkedList;

/**
 * 965. Univalued Binary Tree - https://leetcode.com/problems/univalued-binary-tree/
 *
 * A binary tree is univalued if every node in the tree has the same value.
 * Return true if and only if the given tree is univalued.
 *
 */
public class FindUniValuedTree {
    int commonValue = 0;
    public boolean isUniValTree(TreeNode root) {
        // Create a stack to store the child elements
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

        if (root == null) {
            return true;
        }

        // set the common value from the root node
        commonValue = root.val;

        // push the root node to stack
        stack.offer(root);

        // Perform the operation until stack is empty
        while (!stack.isEmpty()) {

            // get the size of the level
            int size = stack.size();

            // Poll the element from front of  stack, this loop will end when all node at the level is traversed
            for (int i = 0; i < size; i++) {
                TreeNode node = stack.poll();

                // make a check, if the value is not equals to common value, return false.
                if (node.val != commonValue) {
                    return false;
                }

                // Add up all it's child - left & right, it it's not null
                if (node.left != null) {
                    stack.offer(node.left);
                }
                if (node.right != null) {
                    stack.offer(node.right);
                }
            }
        }
        return true;
    }
}
