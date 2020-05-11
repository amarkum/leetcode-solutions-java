package com.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 589. N-ary Tree Preorder Traversal - https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 * <p>
 * Given an n-ary tree, return the preorder traversal of its nodes' values.
 * Nary-Tree input serialization is represented in their level order traversal,
 * each group of children is separated by the null value (See examples).
 */
class NTreePreOrderRecursive {
    List<Integer> postOrderValues = new ArrayList<Integer>();

    public List<Integer> preOrder(Node root) {

        if (root == null) {
            return postOrderValues;
        }
        for (Node node : root.children) {
            preOrder(node);
        }
        postOrderValues.add(root.val);
        return postOrderValues;
    }
}

class NTreePreOrderIterative {

    public List<Integer> preorder(Node root) {
        LinkedList<Integer> preOrderValues = new LinkedList<Integer>();
        LinkedList<Node> stack = new LinkedList<Node>();

        if (root == null) {
            return preOrderValues;
        }

        stack.add(root);

        // Add root to last of the LinkedList
        while (!stack.isEmpty()) {

            // keep polling the last of the LinkedList
            Node node = stack.pollLast();

            // Add the values to the end of the list
            preOrderValues.add(node.val);

            // Reverse the Children nodes
            Collections.reverse(node.children);
            for (Node child : node.children) {
                stack.add(child);
            }
        }
        return preOrderValues;
    }
}