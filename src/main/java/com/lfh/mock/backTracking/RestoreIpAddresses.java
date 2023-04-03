package com.lfh.mock.backTracking;

import java.util.ArrayList;
import java.util.List;


/**
 * Restore IP Addresses
 * <p>
 * Step1 ：
 * 基本的数据:
 * 将数据进行分割。 最多三位数一个dot. 如果三位数大于255 则无效 可以进行剪枝操作。
 */
public class RestoreIpAddresses {

    List<String> result = new ArrayList<>();


    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) {
            return result;
        }
        backTracking(s, 0, 0);
        return result;
    }
    private void backTracking(String s, int startIndex, int pointNum) {

        if (pointNum == 3) {
            if (isValid(s, startIndex, s.length() - 1)) {
                result.add(s);
            }
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isValid(s, startIndex, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                pointNum++;
                backTracking(s, i + 2, pointNum);
                pointNum--;
                s = s.substring(0, i + 1) + s.substring(i + 2);
            }else {
                break;
            }
        }
    }

    private Boolean isValid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) { // 0开头的数字不合法
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') { // 遇到⾮数字字符不合法
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) { // 如果⼤于255了不合法
                return false;
            }
        }
        return true;
    }
}
