package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysTargetSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        int[] a = new int[n];
        String[] data = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(data[i]);
        }

        int[] b = new int[m];
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(inputs[i]);
        }

        for (int i = 0, j = m - 1; i < n; i++) {
            while (i >= 0 && a[i] + b[j] > x) {
                j--;
            }
            if (a[i] + b[j] == x) {
                System.out.println(i + " " + j);
                break;
            }
        }

    }
}
