package com.lfh.mock.sort;

/**
 * @author lfh
 * @version 1.0
 * @date 2023/12/12 22:23
 */
public class TestDemo {

    public static void main(String[] args) {

        Integer a = 24;
        Integer b = 24;
        Integer c = a;
        Integer d = new Integer(24);
        System.out.println(a.toString());

        String sa = "hello";
        String sb = "hello";
        String sc = sa;
        System.out.println(sc);
    }
}
