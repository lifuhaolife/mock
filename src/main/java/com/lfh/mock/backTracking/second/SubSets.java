package com.lfh.mock.backTracking.second;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *  回溯算法的这几种类型： 组合、子集、排列、
 *    以及常见的使用。
 *  1. 元素不重复、不能重选
 *  2、 元素重复、不可重选
 *  3、 元素无重复、 可重选
 *
 *
 *
 */
public class SubSets {

    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0);
        return res;
    }

    /**
     * 再一次忘记了、 二刷还是不会 、、、、
     *
     * 子集 开始、组合、 那肯定是不能再包含自己、
     * 排列。根据 不同的位置， 出现过的还是要进行遍历排序。
     * @param nums
     * @param startIndex
     */
    private void backtrack(int[] nums, int startIndex) {
        res.add(new LinkedList<>(path));
        for (int i = startIndex; i < nums.length; i++) {
            path.addLast(nums[i]);
            backtrack(nums,i + 1);
            path.removeLast();
        }
    }
}
