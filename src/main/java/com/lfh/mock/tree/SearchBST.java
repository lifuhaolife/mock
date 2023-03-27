package com.lfh.mock.tree;

public class SearchBST {


    public TreeNode searchBSTRecursive(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val > root.val) {
            return searchBSTRecursive(root.right, val);
        }else {
            return searchBSTRecursive(root.left, val);
        }
    }


    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val > val) {
                root = root.left;
            }else if (root.val < val){
                root = root.right;
            }else {
                return root;
            }
        }
        return null;
    }
}
