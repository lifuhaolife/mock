package com.lfh.mock.backTracking;

import java.util.ArrayList;
import java.util.List;

public class SubSets {


    List<List<Integer>> result = new ArrayList<>();

    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backTracking(nums, 0);
        return result;
    }

    private void backTracking(int[] nums, int startIndex) {
        result.add(new ArrayList<>(path));
        //终止条件
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backTracking(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
