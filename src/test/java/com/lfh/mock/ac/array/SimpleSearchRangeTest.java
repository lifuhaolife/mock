package com.lfh.mock.ac.array;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleSearchRangeTest {



    @Test
    public void testSearchRangeTestCase1() {
        SimpleSearchRange searchRange = new SimpleSearchRange();
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


    @Test
    public void testSearchRangeTestCase2() {
        SimpleSearchRange searchRange = new SimpleSearchRange();
        /*
        [5,7,7,8,8,10]
        8
         */
        int nums[] = new int[]{1};
        int target = 1;
        int[] ints = searchRange.searchRange(nums, target);
        Assert.assertEquals("[0, 0]", Arrays.toString(ints));
    }
}