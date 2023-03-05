package com.lfh.mock.stack;

import java.util.Deque;
import java.util.LinkedList;

public class Parentheses {


    public boolean valid(String s) {

        Deque<Character> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '{') {
                queue.push('}');
            } else if (c == '(') {
                queue.push(')');
            } else if (c == '[') {
                queue.push(']');
            } else if (queue.isEmpty() || queue.peek() != c) {
                return false;
            } else {
                queue.pop();
            }
        }
        return queue.isEmpty();
    }
}
