package com.lfh.mock.ac.array;

public class GenerateMatrix {

    public int[][] generateMatrix(int n) {

        int loop = 0;
        int[][] matrix = new int[n][n];
        int start = 0, count = 1;
        int i, j;

        while (loop++ < n / 2 ) {
            i = start;
            j = start;
            for (; j < n - loop; j++){
                matrix[i][j] = count++;
            }
            for (; i < n - loop; i++) {
                matrix[i][j] = count++;
            }
            for (;j >= loop; j--){
                matrix[i][j] = count++;
            }
            for (; i >= loop; i--) {
                matrix[i][j] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            matrix[start][start] = count;
        }
        return matrix;
    }
}
