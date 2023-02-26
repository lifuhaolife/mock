package com.lfh.mock.ac.linkedlist;

import org.junit.jupiter.api.Test;

class RemoveNthFromEndTest {

    @Test
    void removeNthFromEnd() {
        /*
        [1,2,3,4,5]
        2
         */
        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
        MyLinkedList integers = new MyLinkedList();
        integers.addAtTail(1);
        integers.addAtTail(2);
        integers.addAtTail(3);
        integers.addAtTail(4);
        integers.addAtTail(5);
        removeNthFromEnd.removeNthFromEndTwoPointers(integers.head, 2);
    }
}