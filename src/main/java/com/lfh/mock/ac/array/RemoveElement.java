package com.lfh.mock.ac.array;

/**
 * 1. 直接进行移除元素、 每一个数据直接往前移动一位
 * 2。 快慢指针。 将符合条件的放在新的位置。 不改变元素顺序
 * 3. 根据相向双指针进行移动处理  改变元素的顺序
 */
public class RemoveElement {


    public int removeElement1(int[] nums, int val) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < size; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;
                size--;
            }
        }
        return size;
    }


    public int removeElement2(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }


    public int removeElement3(int[] nums, int val) {
        int l = 0, r = nums.length - 1;

        while (r >= 0 && nums[r] == val) {
            r--;
        }
        while (l <= r) {
            if (nums[l] == val) {
                nums[l] = nums[r];
                r--;
            }
            l++;
            while (r >= 0 && nums[r] == val) {
                r--;
            }
        }
        return l;
    }
}
