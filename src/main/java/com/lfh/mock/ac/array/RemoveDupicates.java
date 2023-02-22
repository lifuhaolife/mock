package com.lfh.mock.ac.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupicates {


    public int removeDuplicates(int[] nums) {
        // hash
        Set<Integer> hashSet = new HashSet<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                continue;
            }
            hashSet.add(nums[i]);
            nums[j++] = nums[i];
        }
        return j;
    }

    /**
     * Constraints:
     * <p>
     * 1 <= nums.length <= 3 * 104
     * -100 <= nums[i] <= 100
     * nums is sorted in non-decreasing order.
     * <p>
     * Sometimes arrays  have unbelievable effective influence.
     *
     * @param nums
     * @return
     */
    public int removeDuplicates1(int[] nums) {
        int[] resNums = new int[201];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (resNums[nums[i] + 100] >= 1) {
                continue;
            }
            nums[j++] = nums[i];
            resNums[nums[i] + 100]++;
        }
        return j;
    }


    /**
     * excellent job.
     * @param nums
     * @return
     */
    public int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if ( i== 0 || num > nums[i - 1]) {
                nums[i++] = num;
            }
        }
        return i;
    }
}
