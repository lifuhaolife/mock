package com.lfh.mock.ac.array;

/**
 * Find first and last position of element in sorted array;
 * give an array of integers nums sorted in non-decreasing order,
 * find the starting and ending position of a given target value.
 *
 * 最难调试的是如何分清楚数组的左右边界。
 *
 *
 */
public class SimpleSearchRange {


    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        //返回比目标的左边界
        int startPosition = getBorder(nums, low, high, target - 1);
        //返回右边界最后一个 target + 1 的左边界 则 - 1
        int endPosition = getBorder(nums, low, high, target) - 1;

        if (startPosition < nums.length && nums[startPosition] == target) {
            return new int[]{startPosition, endPosition};
        }

        return new int[]{-1, -1};
    }


    /**
     *  主要在于次方法构造。 找到 目标的左右边界。 通过取low high 调试找到进行处理
     * @param nums
     * @param low
     * @param high
     * @param target
     * @return
     */
    private int getBorder(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low >> 1);
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
