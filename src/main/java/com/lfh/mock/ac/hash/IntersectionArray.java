package com.lfh.mock.ac.hash;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * 349. 两个数组的交集
 */
public class IntersectionArray {

    /**
     * 如果数据值范围小可以使用数组开辟空间。
     * 数值大则不适合开辟 过多空间。
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        //遍历数组1
        for (int i : nums1) {
            set1.add(i);
        }
        //遍历数组2的过程中判断哈希表中是否存在该元素
        for (int i : nums2) {
            if (set1.contains(i)) {
                resSet.add(i);
            }
        }
        return resSet.stream().mapToInt(x -> x).toArray();
    }

}
