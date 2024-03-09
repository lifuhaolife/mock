package com.lfh.mock.codetop.sort;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/3/7 22:56
 */
public class SelectSort {




    public int[] selectSort(int[] nums) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {

                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }



}
