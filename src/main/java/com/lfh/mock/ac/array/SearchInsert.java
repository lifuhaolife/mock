package com.lfh.mock.ac.array;


/**
 *  35.
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + r >> 1;
            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            }else {
                return mid;
            }
        }
        return r + 1;
    }
}
