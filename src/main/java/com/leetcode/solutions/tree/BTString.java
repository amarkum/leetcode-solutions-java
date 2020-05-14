package com.leetcode.solutions.tree;

/**
 * 606. Construct String from Binary Tree - https://leetcode.com/problems/construct-string-from-binary-tree/
 *
 * You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.
 * The null node needs to be represented by empty parenthesis pair "()".
 * omit all the empty parenthesis pairs
 * It shouldn't affect the one-to-one mapping relationship between the string and the original binary tree.
 */
class BTString {
    public String tree2str(TreeNode t) {

        // If current node is null, return blank
        if (t == null) return "";

        // If it's a leaf node, return it's value
        if (t.left == null && t.right == null) {
            return String.valueOf(t.val);
        }

        String leftString = tree2str(t.left);
        String rightString = tree2str(t.right);

        // If there's no right node that exists
        if (rightString == "") {
            return String.valueOf(t.val) +
                    "(" +
                    leftString +
                    ")";
        } else {
            return String.valueOf(t.val) +
                    "(" +
                    leftString +
                    ")" +
                    "(" +
                    rightString +
                    ")";
        }
    }
}