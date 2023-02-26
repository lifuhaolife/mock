package com.lfh.mock.ac.linkedlist;

public class ReverseList {

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode temp;
        ListNode cur = head;
        while (cur != null) {
            // 原序列的下一个值临时记录
            temp = cur.next;
            // 将当前的数据指向原来的前一个节点
            cur.next = pre;
            //反转后前驱节点更新
            pre = cur;
            //开始遍历下一个原序列后继节点
            cur = temp;

        }
        return pre;
    }

    public ListNode reverseRecursive(ListNode head) {
        return reverseRecursiveList(head, null);
    }

    private ListNode reverseRecursiveList(ListNode head, ListNode newHead) {
        if (head == null) {
            return null;
        }
        ListNode next = head.next;
        head.next = newHead;
        return reverseRecursiveList(next, head);
    }
}
