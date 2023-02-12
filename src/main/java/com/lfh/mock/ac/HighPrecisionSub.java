package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighPrecisionSub {

    static int N=100010;
    static int[] c=new int[N];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numA = br.readLine();
        String numB = br.readLine();

        System.out.println(minus(numA, numB));
        br.close();
    }

    static String minus(String a, String b) {
        if (a.length() < b.length() || a.length() == b.length() && a.compareTo(b) < 0) {
            return "-" + minus(b, a);
        }
        int k = 0, n = a.length(), m = b.length(), t = 0;
        for (int i = n - 1, j = m - 1; i >= 0; i--) {
            t = a.charAt(i) - '0' - t;
            if (j >= 0) {
                t -= b.charAt(j--) - '0';
            }
            c[k++] = (t + 10) % 10;
            if (t < 0) {
                t = 1;
            } else {
                t = 0;
            }
        }
        while (k > 0 && c[k] == 0) {
            //去掉前导0
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = k; i >= 0; i--) {
            sb.append((char) (c[i] + '0'));
        }
        return sb.toString();
    }
}
