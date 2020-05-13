package com.leetcode.solutions.tree;

import java.util.LinkedList;

/**
 * 559. Maximum Depth of N-ary Tree - https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 *
 * Given a n-ary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class DepthNTreeBFS {

    public int maxDepth(Node root) {
        LinkedList<Node> stack = new LinkedList<Node>();
        int depth = 0;

        // if root is null, return 0 as depth
        if (root == null) {
            return depth;
        }

        // add root node to stack
        stack.offer(root);

        while (!stack.isEmpty()) {

            // calculate size of the current level
            int size = stack.size();

            // iterate every node in that level
            for (int i = 0; i < size; i++) {

                // Pop up all the node by the stack size, set previously
                // Pop method removes the element from front of the LinkedList
                Node node = stack.pop();

                // add all the children at that level
                for (Node child : node.children) {
                    stack.offer(child);
                }
            }

            // increase the depth, when all the node at the level is popped,and children added
            depth++;
        }

        // return the depth
        return depth;
    }
}