package com.lfh.mock.demo;

import java.util.HashSet;
import java.util.Set;

public class DetectCycle {


    public ListNode detectCycle(ListNode head) {

        Set<ListNode> listNodes = new HashSet<>();

        ListNode pos = head;

        while (pos != null) {
            if (listNodes.contains(pos)) {
                return pos;
            } else {
                listNodes.add(pos);
            }
            pos = pos.next;
        }

        return null;
    }

    public ListNode detectCycleTwoPointers(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}
