package com.lfh.mock.codetop.sort;

import java.util.Random;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/3/7 22:46
 */
public class QuickSort {

    public int[] quickSort(int[] nums) {
        randomizesQuickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void randomizesQuickSort(int[] nums, int l, int r) {

        if (l < r) {
            int position = randomPartition(nums, l, r);
            randomizesQuickSort(nums, l, position - 1);
            randomizesQuickSort(nums, position + 1, r);
        }
    }

    private int randomPartition(int[] nums, int l, int r) {
        int i = new Random().nextInt(r - l + 1) + l;
        swap(nums, r, i);
        return partition(nums, l, r);
    }

    private int partition(int[] nums, int l, int r) {
        int pivot = nums[r];
        int i = l - 1;
        for (int j = l; j <= r - 1; ++j) {
            if (nums[j] <= pivot) {
                i = i + 1;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, r);
        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
