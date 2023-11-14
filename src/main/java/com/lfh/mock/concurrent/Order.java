package com.lfh.mock.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author lfh
 * @version 1.0
 * @date 2023/10/30 21:35
 */


public class Order implements Delayed {


    private Long id;

    private Long time;

    private boolean dealFlag;

    public boolean isDealFlag() {
        return dealFlag;
    }

    public void setDealFlag(boolean dealFlag) {
        this.dealFlag = dealFlag;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.toSeconds(10);
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", time=" + time +
                ", dealFlag=" + dealFlag +
                '}';
    }
}
