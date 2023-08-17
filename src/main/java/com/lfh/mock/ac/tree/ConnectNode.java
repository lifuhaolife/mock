package com.lfh.mock.ac.tree;

import java.util.LinkedList;

public class ConnectNode {

    public Node connect(Node root) {
        traverse(root.left, root.right);
        return root;
    }


    /**
     * 递归实现 将左右子节点穿起来、 数据可以用index 这个也可以多一个变量。
     * @param node1
     * @param node2
     */
    private void traverse(Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            return;
        }
        node1.next = node2;
        traverse(node1.left, node1.right);
        traverse(node1.left, node2.right);
        traverse(node1.right, node2.left);
    }


    /**
     * 二叉树的层序遍历
     * @param root
     * @return
     */
    public Node connect1(Node root) {
        if (root == null) {
            return root;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node temp = queue.get(0);
            for (int i = 1; i < size; i++) {
                temp.next = queue.get(i);
                temp = queue.get(i);
            }

            for (int i = 1; i < size; i++) {
                temp = queue.remove(i);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
        return root;
    }


}
