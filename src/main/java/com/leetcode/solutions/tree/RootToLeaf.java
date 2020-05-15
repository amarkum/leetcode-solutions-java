package com.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        stack.offer(node.val);

        if (node.left == null && node.right == null) {
            String rootToLeaf = "";
            for (int number: stack) {
                rootToLeaf += number + "->";
            }
            values.add(rootToLeaf.substring(0, rootToLeaf.length() - 2));
        }

        preOrderDFS(node.left);
        preOrderDFS(node.right);

        stack.pollLast();
    }
}