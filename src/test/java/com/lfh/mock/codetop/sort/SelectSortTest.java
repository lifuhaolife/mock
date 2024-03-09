package com.lfh.mock.codetop.sort;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/3/7 23:25
 */
class SelectSortTest {

    @Test
    void selectSort() {

        int[] nums = {2,4,5,6,7,1,3};
        SelectSort selectSort = new SelectSort();
        int[] result = selectSort.selectSort(nums);
        int[] expected = {1,2,3,4,5,6,7};
        Assert.assertArrayEquals(expected, result);
    }
}