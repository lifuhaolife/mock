package com.lfh.mock.concurrent;

import cn.hutool.core.util.IdUtil;
import java.util.concurrent.DelayQueue;

/**
 * @author lfh
 * @version 1.0
 * @date 2023/10/30 21:34
 */
public class ProductThread extends Thread{


    private static DelayQueue delayQueue = new DelayQueue();

    @Override
    public void run() {

        while (true) {

            Order order = new Order();
            long snowflakeNextId = IdUtil.getSnowflakeNextId();
            order.setId(snowflakeNextId);
            order.setTime(System.currentTimeMillis());
            order.setDealFlag(false);
            delayQueue.add(order);
            System.out.println("add order info to delayQueue");

        }
    }

    public static DelayQueue getDelayQueue() {
        return delayQueue;
    }
}
