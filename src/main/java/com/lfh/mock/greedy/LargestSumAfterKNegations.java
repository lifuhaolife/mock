package com.lfh.mock.greedy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 给你一个整数数组 nums 和一个整数 k ，按以下方法修改该数组：
 * <p>
 * 选择某个下标 i 并将 nums[i] 替换为 -nums[i] 。
 * 重复这个过程恰好 k 次。可以多次选择同一个下标 i 。
 * <p>
 * 以这种方式修改数组后，返回数组 可能的最大和 。
 * <p>
 * 1. 数组按照绝对值大小进行排序。。
 * 2. 如果遇到负数直接将k-- 实行替换，
 * 3. 如果循环结束后都不能完成，将 最后一个数进行取法安
 */
public class LargestSumAfterKNegations {

    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums)
                .boxed()
                .sorted((a, b) -> Math.abs(b) - Math.abs(a))
                .mapToInt(Integer::intValue)
                .toArray();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        if (k % 2 == 1) {
            nums[length - 1] = -nums[length - 1];
        }
        return Arrays.stream(nums).sum();
    }


}
