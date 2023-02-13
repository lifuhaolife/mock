package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrefixSum {


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(" ");
        int dataSize = Integer.parseInt(input[0]);
        int inputSize = Integer.parseInt(input[1]);

        String[] s = bf.readLine().split(" ");
        int[] sumIndex = new int[dataSize + 1];
        sumIndex[0] = 0;
        for (int i = 1; i <=dataSize; i++) {
            sumIndex[i] += sumIndex[i - 1] + Integer.parseInt(s[i - 1]);
        }

        while (inputSize-- > 0) {
            String[] s1 = bf.readLine().split(" ");
            int l = Integer.parseInt(s1[0]);
            int r = Integer.parseInt(s1[1]);
            System.out.println(sumIndex[r] - sumIndex[l - 1]);
        }

        bf.close();

    }
}
