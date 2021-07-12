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
    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

    public List<Double> averageOfLevels(TreeNode root) {

        if (root == null) {
            return averageList;
        }

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Double sum = 0.0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            averageList.add(Double.valueOf(sum / (double) size));
        }
        return averageList;
    }
}