package com.lfh.mock.ac.tree;

public class FlattenTreeNode {

    void flatten(TreeNode root) {
        while (root != null) {
            if (root.left == null) {
                root = root.right;
            }else {
                TreeNode pre = root.left;
                while (pre.right != null) {
                    pre = pre.right;
                }

                pre.right = root.right;
                root.right = root.left;
                root.left = null;
                root = root.right;
            }
        }
    }
    TreeNode pre = null;
    void flatten1(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.right);
        flatten(root.left);

        root.right = pre;
        root.left  = null;
        pre = null;
    }
}
