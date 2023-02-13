package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSubmatrix {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int p = Integer.parseInt(s[2]);

        int[][] matrix = new int[n + 1][m + 1];
        int[][] matrixSum = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                matrixSum[i][j] = matrixSum[i - 1][j] +
                        matrixSum[i][j - 1] - matrixSum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }

        while (p-- > 0) {
            String[] input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int x2 = Integer.parseInt(input[2]);
            int y2 = Integer.parseInt(input[3]);
            System.out.println(matrixSum[x2][y2] - matrixSum[x1 - 1][y2] - matrixSum[x2][y1 - 1] + matrixSum[x1 - 1][y1 - 1]);
        }

        br.close();
    }
}
