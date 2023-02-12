package com.lfh.mock.demo;

public class Solution {


    class ListNode {
        int value;
        ListNode next;

        ListNode (int value) {
            this.value = value;
        }

        ListNode(int value, ListNode listNode) {
            this.value = value;
            this.next = listNode;
        }
    }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        // 如何合并；
        ListNode preA = list1;
        for (int i = 0; i < a - 1; i++) {
            preA = preA.next;
        }

        ListNode preB = preA;
        for (int i = 0; i < b - a + 2; i++) {
            preB = preB.next;
        }

        preA.next = list2;
        while (list2 != null) {
            list2 = list2.next;
        }
        list2.next = preB;

        return list1;
    }
}
