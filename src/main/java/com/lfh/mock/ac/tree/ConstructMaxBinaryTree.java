package com.lfh.mock.ac.tree;

public class ConstructMaxBinaryTree {

    TreeNode constructMaximumBinaryTree(int[] nums) {

        return
                build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int index = -1, maxVal = Integer.MIN_VALUE;
        for (int i = low; i <= high; i++) {
            if (maxVal < nums[i]) {
                index = i;
                maxVal = nums[i];
            }
        }
        TreeNode root = new TreeNode(maxVal);
        root.left = build(nums, low, index - 1);
        root.right = build(nums, index + 1, high);
        return root;
    }
}
