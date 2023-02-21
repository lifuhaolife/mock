package com.lfh.mock.ac.array;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class SearchRangeTest {

    @Test
    public void testSearchRangeTestCase1() {
        SearchRange searchRange = new SearchRange();
        /*
        [5,7,7,8,8,10]
        8
         */
        int nums[] = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] ints = searchRange.searchRange(nums, target);
        System.out.println(Arrays.toString(ints));
        Assert.assertEquals("[3, 4]", Arrays.toString(ints));
    }
}
