package com.lfh.mock.ac.conslsion;

import com.lfh.mock.demo.ListNode;

public class ListNodeDemo {

    /**
     * 如何了解递归的栈；
     *  借助递归栈完成自己的操作。
     *   在进入方法递归调用之前；  立即执行。 之后。等待栈顶结束后最后开始执行。
     *   这里存在一个顺序的问题：
     *      如果想要让数据直接执行，那么就在函数调用之前。  如果是逆序、 或者 通过后面的计算来确定，那么就是递归之后
     *
     *  如果要完成单链表的值倒序打印：  完全可以自己借助栈结构完成 先进后出。
     * @param head
     */
    public void reverseListValue(ListNode head) {
        if (head == null) {
            return;
        }
        System.out.println(head.value);
        reverseListValue(head.next);
        System.out.println(head.value);
    }
}
