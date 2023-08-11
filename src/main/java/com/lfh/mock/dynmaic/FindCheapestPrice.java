package com.lfh.mock.dynmaic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FindCheapestPrice {

    HashMap<Integer, List<int[]>> indegree;
    int src, dst;

    // 备忘录
    int[][] memo;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        k++;
        this.src = src;
        this.dst = dst;
        indegree = new HashMap<>();
        for (int[] flight : flights) {
            int from = flight[0];
            int to = flight[1];
            int price = flight[2];
            indegree.putIfAbsent(to, new LinkedList<>());
            indegree.get(to).add(new int[]{from, price});
        }
        memo = new int[n][k];
        for (int[] row : memo) {
            Arrays.fill(row, -100);
        }
        return dp(dst, k);
    }

    private int dp(int dst, int k) {
        if (dst == src) {
            return 0;
        }
        if (k == 0) {
            return -1;
        }
        if (memo[dst][k] != -100) {
            return memo[dst][k];
        }
        int res = Integer.MAX_VALUE;
        if (indegree.containsKey(dst)) {
            for (int[] v : indegree.get(dst)) {
                int from = v[0];
                int price = v[1];
                int sub = dp(from, k - 1);
                if (sub == -1) {
                    continue;
                }
                res = Math.min(sub + price, res);
            }

        }
        memo[dst][k] = res == Integer.MAX_VALUE ? -1 : res;
        return memo[dst][k];
    }

}
