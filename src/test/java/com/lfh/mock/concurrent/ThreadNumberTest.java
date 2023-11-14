package com.lfh.mock.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import org.junit.jupiter.api.Test;

/**
 * @author lfh
 * @version 1.0
 * @date 2023/10/25 22:29
 */
class ThreadNumberTest {

    @Test
    void testExecutorPool() {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.prestartCoreThread();
        }
        //获取单线程的返回任务
        Future<String> task = executorService.submit(() -> {
            System.out.println("current thread info " + Thread.currentThread().getName() + ": hello");
            return " success";
        });
        try {
            String s = task.get();
            System.out.println("future task return result" + s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        // 获取一组任务
        List<Future<Integer>> futureList = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            Future<Integer> submit = executorService.submit(new ThreadNumber(i));
            futureList.add(submit);
        }
        int sum = 0;
        for (Future<Integer> integerFuture : futureList) {
            try {
                //get 会直接阻塞线程、如果一批任务无法执行完成那么救出与等待的状态
                Integer integer = integerFuture.get();
                sum += integer;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("一批任务执行之后的结果" + sum);
        executorService.shutdown();
    }


}