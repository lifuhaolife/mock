package com.lfh.mock.codetop.list;

import java.util.Stack;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/3/5 22:05
 */
public class RemoveNthFromEnd {

    public ListNode findFromEnd(ListNode head, int k) {
        ListNode p1 = head;

        while (k > 0) {
            p1 = p1.next;
            k--;
        }
        ListNode p2 = head;
        while (p1 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2;
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int length = getLength(head);

        ListNode cur = dummy;
        for (int i = 1; i < length - n + 1; i++) {
            cur = cur.next;
        }

        cur.next = cur.next.next;
        return dummy.next;

    }

    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }


    public ListNode removeNthFromEndUseStack(ListNode head, int n) {

        Stack<ListNode> stack = new Stack<>();
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        while (null != p) {
            stack.push(p);
            p = p.next;
        }

        while (n > 0) {
            stack.pop();
        }
        ListNode cur = stack.pop();
        cur.next = cur.next.next;

        return dummy.next;
    }


    public ListNode removeNthFromEndUseTwoPoint(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode p1 = head;

        while (n > 0) {
            p1 = p1.next;
            n--;
        }

        ListNode p2 = dummy;
        while (null != p1) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p2.next = p2.next.next;

        return dummy.next;
    }


}
