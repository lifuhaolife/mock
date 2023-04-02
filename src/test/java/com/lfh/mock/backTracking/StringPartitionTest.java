package com.lfh.mock.backTracking;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPartitionTest {

    @Test
    void partition() {

        StringPartition stringPartition = new StringPartition();
        List<List<String>> aabb = stringPartition.partition("aab");
        ArrayList<String> strings = Lists.newArrayList("a", "a", "b");
        ArrayList<String> strings1 = Lists.newArrayList("aa","b");
        List<List<String>> checkResult = Lists.newArrayList(strings,strings1);

        Assert.assertArrayEquals(aabb.toArray(),checkResult.toArray());
    }
}