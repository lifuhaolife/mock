package com.lfh.mock.codetop.array;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/2/28 22:03
 */
public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        if (left < 0 || left >= nums.length) {
            return new int[]{-1, -1};
        }
        int leftBound = nums[left] == target ? left : -1;
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] <= target) {
                left = mid + 1;
            }
        }
        if (right < 0 || right >= nums.length) {
            return new int[]{-1, -1};
        }
        int rightBound = nums[right] == target ? right : -1;

        return new int[]{leftBound, rightBound};
    }
}
