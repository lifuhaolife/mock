package com.lfh.mock.tree;

import java.util.Deque;
import java.util.LinkedList;

public class IsSymmetric {


    /**
     * 如果使用递归方式处理  比较左右子树
     *
     * @param root
     * @return
     */
    public boolean isSymmetricRecursive(TreeNode root) {
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left != null || right == null || left != null && right == null) {
            return false;
        }
        boolean outSide = compare(left.left, right.right);
        boolean inSide = compare(left.right, right.left);
        return outSide && inSide;
    }


    /**
     * 迭代方式实现
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root.left);
        deque.offer(root.right);
        while (!deque.isEmpty()) {
            TreeNode leftNode = deque.pollFirst();
            TreeNode rightNode = deque.pollLast();
            if (leftNode == null && rightNode == null) {
                continue;
            }
            if (leftNode == null || rightNode == null || leftNode.val != rightNode.val  ) {
                return false;
            }
            deque.offerFirst(leftNode.left);
            deque.offerFirst(leftNode.right);
            deque.offerLast(rightNode.right);
            deque.offerLast(rightNode.left);
        }
        return true;
    }
}
