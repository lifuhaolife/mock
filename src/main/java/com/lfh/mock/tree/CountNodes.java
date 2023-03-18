package com.lfh.mock.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * Count Complete Tree Nodes
 *
 * Given the root of a complete binary tree, return the number of the nodes in the tree.
 * According to Wikioedia, every level, except possibly the last, is completely filed in a
 * complete binary tree, and all nodes in the last level are as far left as possible.It can
 * have between 1 and 2th nodes inclusive at the last level h.
 * Design an algorithm that runs in less than O(n) time complexity.
 */
public class CountNodes {



    public int countNodesRecursive(TreeNode root) {
      return getNodesNum(root);
    }

    private int getNodesNum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftNum = getNodesNum(root.left);
        int rightNum = getNodesNum(root.right);
        return leftNum + rightNum + 1;
    }


    public int countNodes(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        int result = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                result++;
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }
        return result;
    }
}
