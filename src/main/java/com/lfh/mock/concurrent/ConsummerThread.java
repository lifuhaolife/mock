package com.lfh.mock.concurrent;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author lfh
 * @version 1.0
 * @date 2023/10/30 21:41
 */
public class ConsummerThread extends Thread {


    @Override


    public void run() {

        DelayQueue delayQueue = ProductThread.getDelayQueue();
        System.out.println("delayQueue size is " + delayQueue.size());
        Delayed take = null;
        try {
            take = delayQueue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (null != take) {
            Order order = (Order) take;
            order.setDealFlag(true);
            System.out.println(order);
        }
        try {
            TimeUnit.MILLISECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
