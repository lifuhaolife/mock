package com.lfh.mock.codetop.list;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/3/5 21:38
 */
public class Partition {

    public ListNode partition(ListNode head, int x) {

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode p1 = dummy1;
        ListNode p2 = dummy2;
        ListNode p = head;

        while (p != null) {
            if (p.val >= x) {
                p2.next = p;
                p2 = p2.next;
            } else {
                p1.next = p;
                p1 = p1.next;
            }

            ListNode temp = p.next;
            // 此时 p 属于新的链表，与原本的链表指向取消
            p.next = null;
            p = temp;

        }
        p1.next = dummy2.next;
        return dummy1.next;
    }
}
