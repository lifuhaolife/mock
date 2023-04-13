package com.lfh.mock.greedy;

/**
 * There are n children standing in a line. Each child is assigned a rating value
 * given in the integer array ratings.
 *
 * You are given candies to these children subjected to the following requirements.
 * - Each child must have at least one candy.
 * - Children with a higher rating get more candies than their neighbors.
 *
 * Return the minimum number of candies you need to hanve to distribute the candies
 * to the children.
 *
 * 思路：
 *  如何去进行分糖果：
 *      1. 至少每个一个。
 *      2. 找出比率最小的。
 *   从左至右遍历   比 左边大  比右边小  右边大  右边的糖果= 左边 + 1；
 *   从右至左遍历   比 左边小  比右边大  左边大   左边的糖果取 = 右边 + 1 + 当前啊
 */
public class Candy {

    /**
     分两个阶段
     1、起点下标1 从左往右，只要 右边 比 左边 大，右边的糖果=左边 + 1
     2、起点下标 ratings.length - 2 从右往左， 只要左边 比 右边 大，此时 左边的糖果应该 取本身的糖果数（符合比它左边大） 和 右边糖果数 + 1 二者的最大值，这样才符合 它比它左边的大，也比它右边大
     */
    public int candy(int[] ratings) {
        int length = ratings.length;
        int[] candy = new int[length];
        candy[0] = 1;
        for (int i = 1; i < length; i++) {
            candy[i] = ratings[i] > ratings[i-1] ?  candy[i - 1] + 1 : 1;
        }
        for (int i = length - 2; i  >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] =  Math.max(candy[i], candy[i + 1] + 1);
            }
        }
        int sum = 0;
        for (int i : candy) {
            sum += i;
        }
        return sum;
    }

}
