package com.lfh.mock.tree;


/**
 * Description:
 * <p>You are given an integer array nums without no duplicates. A maximum binary
 * tree can be built recursively from nums using the following algorithm:</p>
 * Create a root node whose value is the maximum value in nums.
 * Recursively build the left subtree on the subarray prefix to the left of the
 * maximum value.
 * Recursively build the right subtree ont the subarray suffix to the right of
 * the maximum value.
 * Return the maximum binary tree built from nums.
 */
public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructBinaryTree(nums, 0, nums.length);
    }

    public TreeNode constructBinaryTree(int[] nums, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex < 1) {
            return null;
        }
        if (rightIndex - leftIndex == 1) {
            return new TreeNode(nums[leftIndex]);
        }
        int maxIndex = leftIndex;
        int maxValue = nums[maxIndex];
        for (int i = leftIndex + 1; i < rightIndex; i++) {
            if (nums[i] > maxValue) {
                maxIndex = i;
                maxValue = nums[i];
            }
        }

        TreeNode treeNode = new TreeNode(maxValue);
        treeNode.left = constructBinaryTree(nums, leftIndex, maxIndex);
        treeNode.right = constructBinaryTree(nums, maxIndex + 1, rightIndex);

        return treeNode;
    }


}
