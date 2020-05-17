package com.leetcode.solutions.tree;

/**
 * 563. Binary Tree Tilt - https://leetcode.com/problems/binary-tree-tilt/
 *
 * Tilt of a tree node is defined as absolute difference between sum of all left node and the sum of all right node.
 * Null node has tilt 0.
 */
class TiltBT {
    int tilt = 0;
    public int findTilt(TreeNode root) {
        dfsPostOrder(root);
        return tilt;
    }

    private int dfsPostOrder(TreeNode node){
        if(node == null){ return 0; }
        int left = dfsPostOrder(node.left);
        int right = dfsPostOrder(node.right);

        // Calculate tilt, absolute difference of left and right, plus the sum
        tilt += Math.abs(left-right);
        return left+right+node.val;
    }
}