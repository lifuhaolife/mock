package com.lfh.mock.dynmaic;

import java.util.Arrays;

/**
 * 322. Coin Change
 * 中等
 * 2.5K
 * 相关企业
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 *
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 *
 *
 *
 * Example 1:
 *
 * Input: coins = [1,2,5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * Example 2:
 *
 * Input: coins = [2], amount = 3
 * Output: -1
 * Example 3:
 *
 * Input: coins = [1], amount = 0
 * Output: 0
 *
 *
 * Constraints:
 *
 * 1 <= coins.length <= 12
 * 1 <= coins[i] <= 231 - 1
 * 0 <= amount <= 104
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        return 0;
    }

    /**
     * 暴力解法。 需要完成拿出每一个硬币进行多次取出遍历
     * 递归的暴力解法时间复杂度计算
     *  2^n
     * @param coins
     * @param amount
     * @return  当前函数的返回意义 输入amount总价 返回最少的coin
     *
     */
    public int coinChangeBruceWay(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 1) {
            return -1;
        }
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {

            int sub = coinChangeBruceWay(coins, amount - coin);
            //如果超出计算那么结束跳过。也不会算进计算之中
            if (sub == -1) {
                continue;
            }
            res = Math.min(res, sub + 1);
        }
        return (res == Integer.MAX_VALUE ? -1 : res);
    }

    /**
     * 备忘录方式解决 对递归的重复计算处理
     * @param coins
     * @param amount
     * @return
     */
    public int coinChangeMemo(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -100);
        return coinsMemo(coins,amount,memo);
    }

    private int coinsMemo(int[] coins, int amount, int[] memo) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (memo[amount] != -100) {
            return memo[amount];
        }
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int sub = coinsMemo(coins,amount - coin, memo);
            if (sub == -1) {
                continue;
            }
            res = Math.min(res, sub + 1);
        }
        memo[amount] = (res == Integer.MAX_VALUE) ? -1 : res;
        return memo[amount];
    }

    /**
     * dp 数组的含义
     *  dp[i]  达到i的价格的最小硬币个数.
     *  从最小的开始迭代。那么下一个需要的就是 dp[i-coin] + 1;
     * @param coins
     * @param amount
     * @return
     */
    public int coinChangeDp(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }


}
