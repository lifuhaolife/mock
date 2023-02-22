package com.lfh.mock.ac.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveElementTest {


    @Test
    public void testRemoveElement1() {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = new int[] {3,2,2,3};
        int i = removeElement.removeElement1(nums, 3);
        Assert.assertEquals(2, i);
    }
}