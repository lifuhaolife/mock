package com.lfh.mock.ac.conslsion;

public class ArrayDemo {

    /**
     * 数字遍历、 字符串遍历
     * @param nums
     */
    public void tranversal(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {

        }
    }

    class ListNode {
        private String val;
        private ListNode next;

    }
    /**
     *
     * 链表遍历
     */
    public void listTranversal(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) {

        }
    }

    public void tranversal(ListNode head) {
        tranversal(head.next);
    }
    class TreeNode {
        private int val;
        TreeNode left;
        TreeNode right;
    }
    /**
     * 二叉树遍历前序
     */
    public void treeTranversal(TreeNode root) {
        //
        System.out.println(root.val);
        treeTranversal(root.left);
        treeTranversal(root.right);
    }

    /**
     * 中序
     */
    public void inOrder(TreeNode root) {
        inOrder(root.left);
        System.out.println(root.left);
        inOrder(root.right);
    }



    
}
