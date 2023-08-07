package com.lfh.mock.dynmaic;

/**
 * 53. 最大子数组和
 * 中等
 * 6.2K
 * 相关企业
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 子数组 是数组中的一个连续部分。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 * 示例 2：
 * <p>
 * 输入：nums = [1]
 * 输出：1
 * 示例 3：
 * <p>
 * 输入：nums = [5,4,-1,7,8]
 * 输出：23
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 */
public class MaxSubArray {


    /**
     * 动态规划解决
     * dp 含义表达 最大的字符串和。
     * dp[i] 的计算取决于前一个值得计算结果是否能   nums[i] 作为开始、或者成为前面的数组最后一个
     * 进行比较大小、
     *
     * @param nums
     * @return
     */
    int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    int maxSubArraySaveSpace(int[] nums) {
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int dp_0 = nums[0];
        int dp_1 = 0, res = dp_0;
        for (int i = 1; i < n; i++) {
            dp_1 = Math.max(nums[i], dp_0 + nums[i]);
            dp_0 = dp_1;
            res = Math.max(res, dp_1);
        }
        return res;
    }
}
