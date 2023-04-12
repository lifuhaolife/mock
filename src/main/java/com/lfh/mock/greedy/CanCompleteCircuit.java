package com.lfh.mock.greedy;

/**
 * 134. 加油站
 * 在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 *
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
 *
 * 给定两个整数数组 gas 和 cost ，如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1 。如果存在解，则 保证 它是 唯一 的。
 *
 *
 * 剩余油量： gas[i],  cos[i]
 * 1. 找到起点应该可以存在多个起点。 找到满足的起点，出发。至少大于自己。
 *  那么这时候可以使用循环遍历的方式。
 * 2、 cos[i] > gas[i] 不能作为起点。
 * 3、 如何在开始行进后对油量计算，
 *  res = gas[i] - cos[i]
 *  如何对内层循环保持继续行进，  res + = gas[i] - cos[i]
 * 4.结果 rest   >= 0. 并且 循环变量与自己相等。
 *
 */
public class CanCompleteCircuit {

    public int canCompleteCircuitBruteForce(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int rest = gas[i] - cost[i];
            // 环形判断为什么要这样处理。
            int index = (i + 1) % cost.length;
            while (rest > 0 && index != i) {
                rest += gas[index] - cost[index];
                index = (index + 1) % cost.length;
            }
            if (rest >= 0 && index == i) {
                return i;
            }
        }
        return -1;
    }
    /*

    1. 从全局考虑 如果gas的总和小于cost总和 、不能走到一圈
    2. 如果rest[i] = gas[i]-cost[i]是第一天剩下的油，
    从零累加到最后一个，没有出现负数。 那么0就是起点。
    3. 如果累加的值为负数，那么节点后能够完成负数 大于。 则其为起点。
 */
    //贪心算法1
    public int canCompleteCircuit1(int[] gas, int[] cost) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < gas.length; i++) {
            int rest = gas[i] - cost[i];
            sum += rest;
            if (sum < min) {
                min = sum;
            }
        }

        if (sum < 0) {
            return -1;
        }
        if (min >= 0) {
            return 0;
        }
        for (int i = gas.length; i > 0; i--) {
            int rest = gas[i] - cost[i];
            min += rest;
            if (min >= 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 如果总量累加 小于0 那么 返回-1.
     * 如果在区间(0,i)存在中间过程小于0. 那么 选择 i+  1为新的起点。
     * @param gas
     * @param cost
     * @return
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;
        int totalSum = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if (curSum < 0) {
                index = (i + 1) % gas.length ;
                curSum = 0;
            }
        }
        if (totalSum < 0) return -1;
        return index;
    }


}
