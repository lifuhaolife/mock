package com.lfh.mock.codetop.list;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/3/5 23:10
 */
public class GetIntersectionNode {


    /**
     * 链表的焦点
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        Set<ListNode> set = new HashSet<>();

        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while (null != headB) {

            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }


    public ListNode getIntersectionNodeMethodII(ListNode headA, ListNode headB) {

        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            if (null == p1) {
                p1 = headB;
            }else {
                p1 = p1.next;
            }
            if (null == p2) {
                p2 = headA;
            }else {
                p2 = p2.next;
            }

        }
        return p1;
    }


    /**
     *  让 A， B 两个链表的出发长度和结束的长度一直， 则情况存在要么相遇， 要么再末尾 == null;
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNodeMethodIII(ListNode headA, ListNode headB) {

        int lenA = 0;
        int lenB = 0;
        for (ListNode p1 = headA; p1.next != null; p1 = p1.next) {
            ++lenA;
        }
        for (ListNode p2 = headB; p2.next != null; p2 = p2.next) {
            ++lenB;
        }
        ListNode p1 = headA, p2 = headB;
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                p1 = p1.next;
            }
        }else {
            for (int i = 0; i < lenB - lenA; i++) {
                p2 = p2.next;
            }
        }

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }


}
