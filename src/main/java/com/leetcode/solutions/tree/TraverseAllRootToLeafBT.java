package com.leetcode.solutions.tree;

import java.util.LinkedList;

/**
 * 1022. Sum of Root To Leaf Binary Numbers - https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 *
 * Given a binary tree, each node has value 0 or 1.
 * Each root-to-leaf path represents a binary number starting with the most significant bit.
 * For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
 */
class TraverseAllRootToLeafBT {
    int sum = 0;
    LinkedList<Integer> stack = new LinkedList<>();

    public int sumRootToLeaf(TreeNode root) {

        // Return 0 if root is null
        if (root == null) {
            return 0;
        }

        // Add current node value to stack
        stack.add(root.val);

        // If we have found the leaf node, compute decimal value, and add it to sum
        if(root.left == null && root.right == null){
            String rootToLeaf = "";
            for(int pathElement: stack){
                rootToLeaf += pathElement;
            }
            sum += Integer.parseInt(rootToLeaf,2);
        }

        // In-order Traversal
        sumRootToLeaf(root.left);
        sumRootToLeaf(root.right);

        // pop the element to find other paths
        stack.removeLast();
        return sum;
    }
}
