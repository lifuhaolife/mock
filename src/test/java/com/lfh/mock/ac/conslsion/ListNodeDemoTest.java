package com.lfh.mock.ac.conslsion;

import com.lfh.mock.demo.ListNode;
import org.junit.jupiter.api.Test;

public class ListNodeDemoTest {



    @Test
    public void testListNode() {
        ListNode listNode = new ListNode(1);

        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode.next = listNode2;
        listNode2.next =listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNodeDemo listNodeDemo = new ListNodeDemo();
        listNodeDemo.reverseListValue(listNode);

    }
}