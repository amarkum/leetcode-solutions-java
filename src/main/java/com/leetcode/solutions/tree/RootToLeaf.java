package com.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 257. Binary Tree Paths - https://leetcode.com/problems/binary-tree-paths/
 *
 * Given a binary tree, return all root-to-leaf paths.
 */
class RootToLeaf {
    LinkedList <Integer> stack = new LinkedList <>();
    List <String> values = new ArrayList <>();

    public List <String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return values;
        }
        preOrderDFS(root);
        return values;
    }

    public void preOrderDFS(TreeNode node) {
        if (node == null) {
            return;
        }

        // Add the value to the stack
        stack.offer(node.val);

        // If we encounter leaf node, we have come across one of the path
        if (node.left == null && node.right == null) {
            String rootToLeaf = "";
            for (int number: stack) {
                rootToLeaf += number + "->";
            }

            // remove the arrow at the last
            values.add(rootToLeaf.substring(0, rootToLeaf.length() - 2));
        }

        preOrderDFS(node.left);
        preOrderDFS(node.right);

        // poll the last element from the stack.
        stack.pollLast();
    }
}