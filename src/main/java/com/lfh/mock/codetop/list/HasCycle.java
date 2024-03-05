package com.lfh.mock.codetop.list;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/3/5 22:52
 */
public class HasCycle {


    /**
     * 使用快满指针，如果有环那么指针，快慢指针肯定会相遇。
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (null != fast && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
