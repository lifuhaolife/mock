package com.lfh.mock.demo;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class DecodeMessage {


    public String decodeMessage(String key, String message) {
        // a -> z
        char cur = 'a';
        Map<Character, Character> rules = new HashMap<Character, Character>();

        for (int i = 0; i < key.length(); ++i) {
            char c = key.charAt(i);
            if (c != ' ' && !rules.containsKey(c)) {
                rules.put(c, cur);
                ++cur;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); ++i) {
            char c = message.charAt(i);
            if (c != ' ') {
                c = rules.get(c);
            }
            sb.append(c);
        }

        return sb.toString();

    }


    @Test
    public void testCase1() {

        String key = "eljuxhpwnyrdgtqkviszcfmabo",
                message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        String s = decodeMessage(key, message);
        assert s.equals("the five boxing wizards jump quickly");
    }
}
