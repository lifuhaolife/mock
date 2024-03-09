package com.lfh.mock.codetop.sort;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/3/7 23:48
 */
public class InsertionSort {

    public int[] insertionSort(int[] nums) {
        int len = nums.length;

        for (int i = 1; i < len; i++) {

            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }
}
