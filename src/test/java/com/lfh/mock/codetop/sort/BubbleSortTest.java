package com.lfh.mock.codetop.sort;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author lfh
 * @version 1.0
 * @date 2024/3/7 23:04
 */
class BubbleSortTest {

    @Test
    void bubbleSort() {

        BubbleSort bubbleSort = new BubbleSort();

        int[] nums = {2,4,5,6,7,1,3};
        int[] result = bubbleSort.bubbleSort(nums);
        int[] expected = {1,2,3,4,5,6,7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    void testBubbleSort() {
    }
}