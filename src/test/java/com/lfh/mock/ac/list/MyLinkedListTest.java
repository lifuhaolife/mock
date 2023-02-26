package com.lfh.mock.ac.list;

import com.lfh.mock.ac.linkedlist.MyLinkedList;
import org.junit.Test;

public class MyLinkedListTest {


    @Test
    public void test() {
//["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get","get","deleteAtIndex",
// "deleteAtIndex","get","deleteAtIndex","get"]
//[[],[1],[3],[1,2],[1],[1],[1],[3]
// ,[3],[0],[0],[0],[0]]
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);
        int i = myLinkedList.get(1);
        myLinkedList.deleteAtIndex(1);
        myLinkedList.get(1);
        myLinkedList.get(3);
        myLinkedList.deleteAtIndex(3);
        myLinkedList.deleteAtIndex(0);
        myLinkedList.get(0);
        myLinkedList.deleteAtIndex(0);
        myLinkedList.get(0);
        myLinkedList.deleteAtIndex(0);

    }

}