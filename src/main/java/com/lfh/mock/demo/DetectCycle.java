package com.lfh.mock.demo;

import java.util.HashSet;
import java.util.Set;

public class DetectCycle {


    public ListNode detetCycle(ListNode head) {

        Set<ListNode> listNodes = new HashSet<>();

        ListNode pos = head;

        while (pos != null) {
            if (listNodes.contains(pos)) {
                return pos;
            }else {
                listNodes.add(pos);
            }
            pos = pos.next;
        }

        return null;
    }
}
