package com.leetcode.solutions.tree;

/**
 * 572. Subtree of Another Tree - https://leetcode.com/problems/subtree-of-another-tree/
 *
 *  2 non-empty binary trees s and t, check if tree t has exactly same structure and node values with a subtree of s.
 * A subtree of s is a tree consists of a node in s and all of this node's descendants.
 * The tree s could also be considered as a subtree of itself.
 */
class FindSubtree {

    /**
     *  Serialize Approach - Another approach is find the node value of subtree in parent tree
     *  compare if tree are same from that point
     */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        StringBuilder sbd1 = new StringBuilder();
        StringBuilder sbd2 = new StringBuilder();
        preOrder(sbd1, s);
        preOrder(sbd2, t);
        // Since we serialized the pre-order, using contains will work perfect, no chances of shuffle
        return sbd1.toString().contains(sbd2);
    }

    // Do a Preorder Traversal, append - when null , and | for next value
    private void preOrder(StringBuilder sbd, TreeNode t) {
        if (t == null) {
            sbd.append("-");
            return;
        }
        sbd.append("|").append(t.val);
        preOrder(sbd, t.left);
        preOrder(sbd, t.right);
    }
}