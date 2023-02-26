package com.lfh.mock.ac.linkedlist;

/**
 * 19. Remove Nth Node From End of List
 * Medium
 * 14.9K
 * 614
 * Companies
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * Example 2:
 * <p>
 * Input: head = [1], n = 1
 * Output: []
 * Example 3:
 * <p>
 * Input: head = [1,2], n = 1
 * Output: [1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is sz.
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 * <p>
 * <p>
 * solution1:
 * a. we can itetor the linkedList that the one's size will figure out
 * and put every node in hashSet.
 * b. Using count decrease K + 1 . get from hash.
 * <p>
 * Solution2:
 * two pointers;
 * a. fast pointer will run n + 1 step
 * b. low pointer and fast will come on together
 */
public class RemoveNthFromEnd {



    public ListNode removeNthFromEndTwoPointers(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode fastIndex = dummyHead;
        ListNode slowIndex = dummyHead;

        while (fastIndex.next != null && n-- > 0) {
            fastIndex = fastIndex.next;
        }
        while (fastIndex.next != null) {
            fastIndex = fastIndex.next;
            slowIndex = slowIndex.next;
        }
        // 当快指针走到尽头、慢指针走到要删除的前一个元素
        slowIndex.next = slowIndex.next.next;
        return dummyHead.next;

    }
}
