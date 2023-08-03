package com.lfh.mock.dynmaic;

public class BagProblem {

    public static void main(String[] args) {
        int[] weight = {1,3,4};
        int[] value = {15,20,30};
        int bagSize = 4;
        testWeightBagProblem(weight, value, bagSize);
    }

    private static void testWeightBagProblem(int[] weight, int[] value, int bagSize) {
        int goods = weight.length;
        int[][] dp = new int[goods][bagSize + 1];
        for (int j = weight[0]; j <= bagSize ; j++) {
            dp[0][j] = value[0];
        }

        for (int i = 1; i < weight.length; i++) {
            for (int j = 1; j < bagSize; j++) {
               if (j < weight[i]) {
                   /**
                    * 当前背包的容量都没有当前物品i大的时候，是不放物品i的
                    * 那么前i-1个物品能放下的最大价值就是当前情况的最大价值
                    */
                   dp[i][j] = dp[i-1][j];
               }else {
                   /**
                    * 当前背包的容量可以放下物品i
                    * 那么此时分两种情况：
                    *    1、不放物品i
                    *    2、放物品i
                    * 比较这两种情况下，哪种背包中物品的最大价值最大
                    */
                   dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - weight[i]] + value[i]);
               }
            }
        }
        // 打印dp数组
        for (int i = 0; i < goods; i++) {
            for (int j = 0; j <= bagSize; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
