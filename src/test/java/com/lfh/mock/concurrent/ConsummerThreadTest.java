package com.lfh.mock.concurrent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lfh
 * @version 1.0
 * @date 2023/10/30 21:48
 */
class ConsummerThreadTest {



    @Test
    public void testConsummerOrder() {

        new ProductThread().start();
        new ConsummerThread().start();
        while (true) {

       }
    }

}