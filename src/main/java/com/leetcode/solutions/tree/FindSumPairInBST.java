package com.leetcode.solutions.tree;

import java.util.HashSet;

/**
 * 653. Two Sum IV - Input is a BST - https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 * <p>
 * Given a Binary Search Tree and a target number,
 * return true if there exist two elements in the BST such that their sum is equal to the given target
 */
class FindSumPairInBST {
    HashSet<Integer> values = new HashSet<Integer>();
    boolean isSumExists = false;

    public boolean findTarget(TreeNode root, int k) {
        dfsPreOrder(root, k);
        return isSumExists;
    }

    // Do a Depth First Search, to visit each node
    public void dfsPreOrder(TreeNode root, int sum) {

        if (root == null) {
            return;
        }

        // calculate the difference required, from sum - current node's value
        int difference = sum - root.val;

        // If it it exist we in the set we have such pairs
        if (values.contains(difference)) {
            isSumExists = true;
            return;
        }

        // If we did not get any such element, add the node's current value to the set
        values.add(root.val);
        findTarget(root.left, sum);
        findTarget(root.right, sum);
    }
}
