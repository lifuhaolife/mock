package com.lfh.mock.ac.list;


class ListNode {

    int val;

    ListNode next;

    ListNode(int value) {
        this.val = value;
    }

    ListNode(int value, ListNode listNode) {
        this.val = value;
        this.next = listNode;
    }
}

public class RemoveListElement {


    public ListNode removeElements1(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }


    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
