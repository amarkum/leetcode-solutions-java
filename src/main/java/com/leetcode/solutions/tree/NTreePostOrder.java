package com.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 590. N-ary Tree Post-order Traversal - https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 * <p>
 * Given an n-ary tree, return the post-order traversal of its nodes' values.
 * Nary-Tree input serialization is represented in their level order traversal,
 * each group of children is separated by the null value.
 */
class NTreePostOrderRecursive {
    List<Integer> postOrderValues = new ArrayList<Integer>();

    public List<Integer> postOrder(Node root) {

        if (root == null) {
            return postOrderValues;
        }
        for (Node node : root.children) {
            postOrder(node);
        }
        postOrderValues.add(root.val);
        return postOrderValues;
    }
}

class NTreePostOrderIterative {

    public List<Integer> postOrder(Node root) {
        LinkedList<Integer> postOrderValues = new LinkedList<Integer>();
        LinkedList<Node> stack = new LinkedList<>();

        if (root == null) {
            return postOrderValues;
        }

        // Add root node to Stack
        stack.add(root);

        while (!stack.isEmpty()) {
            // keep polling the top of the LinkedList
            Node node = stack.pollLast();

            // keep adding new node values at first
            postOrderValues.addFirst(node.val);

            // Add all node children in the stack
            for (Node child : node.children) {
                stack.add(child);
            }
        }
        return postOrderValues;
    }
}