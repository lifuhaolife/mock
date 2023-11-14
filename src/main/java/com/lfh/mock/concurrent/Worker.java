package com.lfh.mock.concurrent;

import org.ehcache.impl.internal.util.ThreadFactoryUtil;

/**
 * @author lfh
 * @version 1.0
 * @date 2023/10/25 23:39
 */
public class Worker implements Runnable{

    private Thread thread;

    private Runnable command;

    public Worker(Runnable command) {
        this.command = command;
        this.thread = ThreadFactoryUtil.threadFactory("hello").newThread(this);
    }

    @Override
    public void run() {
        command.run();
    }

    public Thread getThread() {
        return thread;
    }
}
