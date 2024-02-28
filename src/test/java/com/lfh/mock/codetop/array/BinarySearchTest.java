package com.lfh.mock.codetop.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/2/28 21:03
 */
class BinarySearchTest {

    @Test
    void binarySearch() {

        BinarySearch binarySearch = new BinarySearch();
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int result = binarySearch.binarySearch(nums, 9);
        Assert.assertEquals(4, result);
    }


    @Test
    void leftBound() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = new int[]{-1, 0, 3, 3, 3, 3, 5, 9, 12};
        int result = binarySearch.leftBound(nums, 3);
        Assert.assertEquals(2, result);
    }

    @Test
    void rightBound() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = new int[]{-1, 0, 3, 3, 3, 3, 5, 9, 12};
        int result = binarySearch.rightBound(nums, 3);
        Assert.assertEquals(5, result);
    }
}