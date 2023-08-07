package com.lfh.mock.ac.array;

public class MaxSubArray {

    int maxSubArray(int[] nums) {

        int left = 0, right = 0;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (right < nums.length) {
            windowSum += nums[right];
            right++;
            maxSum = windowSum > maxSum ? windowSum : maxSum;

            while (maxSum < 0) {
                windowSum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}
