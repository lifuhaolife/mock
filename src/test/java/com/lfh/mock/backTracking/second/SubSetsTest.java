package com.lfh.mock.backTracking.second;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubSetsTest {



    @Test
    public void testSubSets() {
        SubSets subSets = new SubSets();

        List<List<Integer>> subsets = subSets.subsets(new int[]{1, 2, 3});
    }


}