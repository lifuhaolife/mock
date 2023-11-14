package com.lfh.mock.concurrent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lfh
 * @version 1.0
 * @date 2023/10/25 23:42
 */
class WorkerTest {


    @Test
    public void testThreadInThread() {

        Worker worker = new Worker(() -> {
            System.out.println(Thread.currentThread().getName() + " ： hello, world");
        });
        worker.getThread().start();
    }

}