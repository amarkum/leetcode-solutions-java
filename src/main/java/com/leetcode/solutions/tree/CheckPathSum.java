package com.leetcode.solutions.tree;

import java.util.Stack;

/**
 * 112. Path Sum - https://leetcode.com/problems/path-sum/
 *
 * Given a binary tree and a sum,
 * determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 */
class CheckPathSum {
    Stack<Integer> stack = new Stack<Integer>();
    boolean sumExists = false;
    int pathSum = 0;
    public boolean hasPathSum(TreeNode root, int sum) {
        pathSum = sum;
        dfsInOrder(root);
        return sumExists;

    }

    public void dfsInOrder(TreeNode node){
        if(node == null){
            return;
        }

        stack.push(node.val);

        if(node.left == null && node.right == null){
            int sum = 0;
            for(int number : stack){
                sum += number;
            }
            if(sum == pathSum){
                sumExists = true;
                return;
            }
        }
        dfsInOrder(node.left);
        dfsInOrder(node.right);

        stack.pop();

    }
}
