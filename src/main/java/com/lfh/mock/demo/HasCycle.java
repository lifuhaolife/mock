package com.lfh.mock.demo;

import java.util.HashSet;

public class HasCycle {



    public boolean hasCycle (ListNode head) {
        HashSet<ListNode> listNodes = new HashSet<>();

        while (head != null) {
            if (!listNodes.add(head)) {
                return true;
            };
            head = head.next;
        }
        return false;
    }
}
