package com.lfh.mock.concurrent;

import java.util.concurrent.Callable;

/**
 * @author lfh
 * @version 1.0
 * @date 2023/10/25 22:15
 */
public class ThreadNumber implements Callable {

    private int number;
    ThreadNumber(int number) {
        this.number = number;
    }
    @Override
    public Integer call() throws Exception {
        return number;
    }
}
