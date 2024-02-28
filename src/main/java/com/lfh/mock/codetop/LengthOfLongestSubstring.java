package com.lfh.mock.codetop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public int lengthOfLongestSubstring_02(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int max = 0;
        for (; right < s.length(); right++) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                char d = s.charAt(left);
                set.remove(d);
                left++;
            }
            set.add(c);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

}
