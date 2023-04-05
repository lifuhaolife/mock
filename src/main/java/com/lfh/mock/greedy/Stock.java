package com.lfh.mock.greedy;

/**
 * 自己总结三个点：
 *  1. 可以进行买卖、 记录、 每一次都要遍历。
 */
public class Stock {

    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {

            result += Math.max(prices[i] - prices[i-1], 0);
        }
        return result;
    }


}
