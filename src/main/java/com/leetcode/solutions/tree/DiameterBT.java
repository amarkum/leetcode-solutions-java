package com.leetcode.solutions.tree;

/**
 * 543. Diameter of Binary Tree - https://leetcode.com/problems/diameter-of-binary-tree/
 *
 * Given a binary tree, you need to compute the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 */
class DiameterBT {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int lheight = height(root.left); // Computer the left depth
        int rheight = height(root.right); // Computer the right depth

        int ldiameter = diameterOfBinaryTree(root.left);
        int rdiameter = diameterOfBinaryTree(root.right);

        // Add lheight + rheight + 1, If we are considering root as well
        // Choose from diameter or l & r diameter.
        return Math.max(lheight + rheight, Math.max(ldiameter, rdiameter));
    }

    public int height(TreeNode node) {
        if (node == null)
            return 0;

        return (1 + Math.max(height(node.left), height(node.right)));
    }

}
