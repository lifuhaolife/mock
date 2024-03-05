package com.lfh.mock.codetop.list;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/3/5 22:45
 */
public class MiddleNode {


    public ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (null != fast && null != fast.next) {
            fast =fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
