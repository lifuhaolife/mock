package com.lfh.mock.codetop.list;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/3/5 23:04
 */
public class HasCycleII {


    /**
     * 已知的思路复现。
     *
     * @param head
     * @return
     */

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (null != fast && null != fast.next) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                break;
            }
        }
        //while 的退出条件可能 fast == null;
        if (null == fast || null == fast.next) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
