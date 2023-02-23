package com.lfh.mock.ac.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinSubArraylenTest {



    @Test
    public void test() {

        MinSubArraylen min = new MinSubArraylen();
        int[] nums = new int[]{2,3,1,2,4,3};
        int i = min.minSubArrayLen(7, nums);
        Assert.assertEquals(2, i);


    }

}