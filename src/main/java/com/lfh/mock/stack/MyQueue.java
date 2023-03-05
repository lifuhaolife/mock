package com.lfh.mock.stack;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stackIn = new Stack();
    Stack<Integer> stackOut = new Stack();

    public MyQueue() {
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        dumpStackIn();
        return stackOut.pop();
    }

    public int peek() {
        dumpStackIn();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    public void dumpStackIn() {
        while (!stackOut.isEmpty()){
            return;
        }
        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }
    }
}
