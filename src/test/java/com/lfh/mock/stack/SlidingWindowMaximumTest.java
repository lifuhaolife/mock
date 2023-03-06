package com.lfh.mock.stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumTest {

    @Test
    void maxSlidingWindow() {

        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
        int[] ints = slidingWindowMaximum.maxSlidingWindow(nums, 3);

        Assert.assertEquals("[3,3,5,5,6,7]", Arrays.toString(ints));

    }
}