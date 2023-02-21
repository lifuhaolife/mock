package com.lfh.mock.ac.array;

public class SearchRange {

    public int[] searchRange(int[] nums, int target) {

        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);
        //1. 找不到左右边界。 处于数组左右两边之外
        if (leftBorder == -2 || rightBorder == -2) {
            return new int[]{-1, -1};
        }
        //2. 左边边界存在、 有边界不存在
        if (rightBorder - leftBorder > 1) {
            return new int[]{leftBorder + 1, rightBorder - 1};
        }
        // 3. 在数组中的数范围中， 但是不存在。
        return new int[]{-1, -1};
    }

    private int getRightBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int rightBorder = -2;
        while (left <= right) {
            int middle = left + right >> 1;
            if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
                /*
                 * 小于等于 的时候能够一直往右边推送。 得到最远的同一个值。
                 */
                rightBorder = left;
            }
        }
        // 找不到返回默认值
        return rightBorder;
    }

    private int getLeftBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2;
        while (left <= right) {
            int middle = left + right >> 1;
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
                // 大于等于有边界的时候一直往左进行推。得到左边界.
                leftBorder = right;
            }
        }
        return leftBorder;
    }

}
