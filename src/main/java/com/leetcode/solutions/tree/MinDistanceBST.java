package com.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 783. Minimum Distance Between BST Nodes - https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 *
 * Given a Binary Search Tree (BST) with the root node root,
 * return the minimum difference between the values of any two different nodes in the tree.
 */
class MinDistanceBST {
    int minimumDifference = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
        inOrderDFS(root);

        // Re-assign the minimum difference if any
        for(int i=1; i<list.size(); i++){
            minimumDifference = Math.min(list.get(i)-list.get(i-1), minimumDifference);
        }
        return minimumDifference;
    }

    // Do a In Order Traversal
    public void inOrderDFS(TreeNode node){
        if(node==null){
            return;
        }
        inOrderDFS(node.left);
        list.add(node.val);
        inOrderDFS(node.right);
    }
}