package com.lfh.mock.backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Step 1:
 *
 */
public class StringPartition {

    List<List<String>> result = new ArrayList<>();
    LinkedList<String> list = new LinkedList<>();
    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return result;
    }

    private void backTracking(String s, int startIndex) {
        if (startIndex >= s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isPalindrome(s, startIndex, i)) {
                String substring = s.substring(startIndex, i + 1);
                list.add(substring);;
            } else {
                continue;
            }
            backTracking(s, i + 1);
            list.removeLast();
        }
    }
    private boolean isPalindrome(String s, int start, int end) {
        for (int i = start,j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
