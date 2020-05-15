package com.leetcode.solutions.tree;

import java.util.Stack;

/**
 * 538. Convert BST to Greater Tree - https://leetcode.com/problems/convert-bst-to-greater-tree/
 *
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that -
 * every key of original BST is changed to original key plus sum of all keys greater than the original key in BST.
 */
class BSTGreaterTree {
    Stack<Integer> inOrderValues = new Stack<>();
    Stack<Integer> greaterTreeValues = new Stack<>();

    public TreeNode convertBST(TreeNode root) {

        if (root == null) {
            return null;
        }

        inOrder(root);
        createLatestStack(inOrderValues, greaterTreeValues);
        formTree(root, greaterTreeValues);
        return root;
    }

    // pop elements from the stack, and keep adding new node value with addition to previous stack value
    public void createLatestStack(Stack old, Stack current) {
        current.push(old.pop());
        while (!old.isEmpty()) {
            current.push((int) current.peek() + (int) old.pop());
        }
    }

    // perform an inOrder Traversal
    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        inOrderValues.push(node.val);
        inOrder(node.right);
    }

    // overwrite the value of node with stack
    public void formTree(TreeNode node, Stack s1) {

        if (node == null) {
            return;
        }
        formTree(node.left, s1);
        node.val = (int) s1.pop();
        formTree(node.right, s1);
    }
}