package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Difference {


    private static int[] b;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[] inputData = br.readLine().split(" ");
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(inputData[i - 1]);
        }

        b = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            insert(i, i, a[i]);
        }

        while (m-- > 0) {
            String[] param = br.readLine().split(" ");
            int l = Integer.parseInt(param[0]);
            int r = Integer.parseInt(param[1]);
            int v = Integer.parseInt(param[2]);
            insert(l, r, v);
        }

        for (int i = 1; i <= n; i++) {
            b[i] += b[i - 1];
        }

        for (int i = 1; i <= n; i++) {
            System.out.printf(b[i] + " ");
        }
        br.close();
    }

    private static void insert(int l, int r, int value) {
        b[l] += value;
        b[r + 1] -= value;
    }
}
