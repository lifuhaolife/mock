package com.lfh.mock.codetop.array;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/2/28 21:53
 * @description: 滑动窗口的机制：
 * 1. right指针增加到什么时候合适？
 * 2。 left 指针什么时候缩小
 * 3. 什么时候满足条件返回。
 */
public class SlideWindow {

    public void slideWindow(String s) {

        int left = 0;
        int right = 0;
        while (right < s.length()) {

            right++;
            while (left < right) {
                left++;
            }
        }
    }

}
