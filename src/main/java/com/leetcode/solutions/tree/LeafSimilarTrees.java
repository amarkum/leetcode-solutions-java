package com.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 872. Leaf-Similar Trees - https://leetcode.com/problems/leaf-similar-trees/
 *
 * Consider all the leaves of a binary tree.
 * From left to right order, the values of those leaves form a leaf value sequence.
 */
class LeafSimilarTrees {
    LinkedList<Integer> stack = new LinkedList<Integer>();
    List<Integer> treeOneLeafNodes = new ArrayList<Integer>();
    List<Integer> treeTwoLeafNodes = new ArrayList<Integer>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        depthFirstSearch(root1, treeOneLeafNodes);
        depthFirstSearch(root2, treeTwoLeafNodes);

        return treeOneLeafNodes.equals(treeTwoLeafNodes);
    }

    public void depthFirstSearch(TreeNode node, List listOfLeaf) {

        // Edge Case, when node becomes null return, Performing Depth First Search - Any Traversal Order
        if (node == null) {
            return;
        }

        // Add the value to the stack
        stack.add(node.val);

        // If it encounters leaf node,(node is not null,but has no left and right node),add the last value to list
        if (node.left == null && node.right == null) {
            listOfLeaf.add(stack.getLast());
        }

        depthFirstSearch(node.left, listOfLeaf);
        depthFirstSearch(node.right, listOfLeaf);

        // remove the last element from the stack, to backtrack and put the new element in stack
        stack.removeLast();
    }


}
