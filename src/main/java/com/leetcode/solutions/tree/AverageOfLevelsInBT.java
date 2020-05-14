package com.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 637. Average of Levels in Binary Tree - https://leetcode.com/problems/average-of-levels-in-binary-tree/
 *
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 */
public class AverageOfLevelsInBT {
    List<Double> averageList = new ArrayList<Double>();
    LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

    public List<Double> averageOfLevels(TreeNode root) {

        while (root == null) {
            return averageList;
        }

        stack.offer(root);

        while (!stack.isEmpty()) {
            int size = stack.size();
            Double sum = 0.0;
            for (int i = 0; i < size; i++) {
                TreeNode node = stack.poll();
                sum += node.val;

                if (node.left != null) {
                    stack.offer(node.left);
                }
                if (node.right != null) {
                    stack.offer(node.right);
                }
            }
            averageList.add(Double.valueOf(sum / (double) size));
        }
        return averageList;
    }
}