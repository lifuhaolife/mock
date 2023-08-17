package com.lfh.mock.ac.tree;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class InvertTree {


    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }


    public TreeNode invertTree1(TreeNode root) {
        traverse(root);
        return root;
    }

    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        traverse(root.left);
        traverse(root.right);
    }


    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return root;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.left != null) {
                queue.offer(cur.right);
            }
        }
        return root;
    }

    /**
     *  二叉树的先序遍历迭代：
     * @param root
     * @return
     */
    public TreeNode invertTree3(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;
        while (cur != null && !stack.isEmpty()) {

            if (cur != null) {
                TreeNode temp = cur.left;
                cur.left = cur.right;
                cur.right = temp;
                stack.push(cur);
                cur = cur.left;
            }else {
                stack.pop();
                cur = cur.right;
            }
        }
        return root;
    }
}
