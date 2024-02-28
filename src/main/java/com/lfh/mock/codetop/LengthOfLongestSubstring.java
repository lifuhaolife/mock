package com.lfh.mock.codetop;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/2/26 20:20
 */
public class LengthOfLongestSubstring {


    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>();
        int left = 0;
        int right = 0;
        int res = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            window.put(c, window.getOrDefault(c, 0) + 1);
            while (window.get(c) > 1) {
                char d = s.charAt(left);
                window.put(d, window.get(d) - 1);
                left++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
