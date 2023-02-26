package com.lfh.mock.ac.linkedlist;

/**
 * 24. Swap Nodes in Pairs
 * Medium
 * 9.2K
 * 354
 * Companies
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You must solve the problem without modifying the values in the list's
 * nodes (i.e., only nodes themselves may be changed.)
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 * Example 2:
 * <p>
 * Input: head = []
 * Output: []
 * Example 3:
 * <p>
 * Input: head = [1]
 * Output: [1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 100].
 * 0 <= Node.val <= 100
 */
public class SwapPairs {


    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = dummyHead;

        while (cur.next != null && cur.next.next != null) {
            ListNode temp = cur.next;
            // 每两个要交换的节点  必须要找到第三个节点才能继续进行遍历下去
            ListNode temp1 = cur.next.next.next;
            // 第二个节点变为头节点、 被虚拟头节点指向
            cur.next = cur.next.next;
            // 第二个节点指向第一个节点
            cur.next.next = temp;
            //第三个节点指向第二个节点
            cur.next.next.next  = temp1;
            // 虚拟头节点向前走两部、 完成前两个数交换。
            cur = cur.next.next;
        }
        return dummyHead.next;
    }

    public ListNode swapPairsRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next;
        head.next = swapPairsRecursion(head.next.next);
        temp.next = head;
        return temp;
    }
}
