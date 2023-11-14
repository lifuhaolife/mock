package com.lfh.mock.second.array;

public class RemoveDuplicates {


    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            // fast指针去找到不同的
            if (nums[slow] != nums[fast]) {
                //先更新满指针索引赋值
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }

}
