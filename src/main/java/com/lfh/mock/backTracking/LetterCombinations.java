package com.lfh.mock.backTracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return list;
        }
        //初始对应所有的数字，为了直接对应2-9，新增了两个无效的字符串""
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //迭代处理
        backTracking(digits, numString, 0);
        return list;
    }

    StringBuilder temp = new StringBuilder();
    private void backTracking(String digits, String[] numString, int num) {
        if(num == digits.length()) {
            list.add(temp.toString());
            return;
        }

        String s = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < s.length(); i++) {
            temp.append(s.charAt(i));
            backTracking(digits, numString, i + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
