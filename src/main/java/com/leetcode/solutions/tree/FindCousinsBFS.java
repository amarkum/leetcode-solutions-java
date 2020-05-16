package com.leetcode.solutions.tree;

import java.util.LinkedList;

/**
 * 993. Cousins in Binary Tree - https://leetcode.com/problems/cousins-in-binary-tree/
 * <p>
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 */
class FindCousinsBFS {
    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

    public boolean isCousins(TreeNode root, int x, int y) {

        // Add root node to Queue, Do a BFS
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            // set xExists && yExists to false each time at a level traversal
            boolean xExists = false;
            boolean yExists = false;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                // Check if x and y exists in the same level, set as true
                if (node.val == x) {
                    xExists = true;
                }

                if (node.val == y) {
                    yExists = true;
                }

                // Check for the exception case, if the children have common parent, return false
                if (node.left != null & node.right != null) {
                    if (node.left.val == x && node.right.val == y) {
                        return false;
                    }
                    if (node.right.val == x && node.left.val == y) {
                        return false;
                    }
                }

                // keep adding children to queue
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            // After one level traversal, check if x and y exists, then return true.
            if (xExists && yExists) {
                return true;
            }
        }
        // Return False, for all other cases.
        return false;
    }
}
