package com.lfh.mock.codetop.list;

import java.util.PriorityQueue;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/3/5 21:50
 */
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (null == lists || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length,
                (a, b) -> a.val - b.val);

        for (ListNode head : lists) {
            if (null != head) {
                pq.add(head);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            if (null != node.next) {
                pq.add(node.next);
            }
            p.next = node;
            p = p.next;
        }

        return dummy.next;
    }
}
