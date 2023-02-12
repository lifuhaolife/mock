package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheKthNumber {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bufferedReader.readLine().split(" ");

        int nums = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        String[] arr = bufferedReader.readLine().split(" ");
        int[] sort = new int[nums];
        for (int i = 0; i < nums; i++) {
            sort[i] = Integer.parseInt(arr[i]);
        }

        System.out.println(quickSort(sort, 0, nums - 1, k));

        bufferedReader.close();
    }

    private static int quickSort(int[] sort, int l, int r, int k) {
        if ( l == r) {
            return sort[l];
        }
        int x = sort[ l + r >> 1], i = l - 1, j = r + 1;

        while (i < j) {
            while (sort[++i] < x);
            while (sort[--j] > x);
            if (i < j) {
                int temp = sort[i];
                sort[i] = sort[j];
                sort[j] = temp;
            }
        }
        int sl = j - l + 1;

        if ( k <=  sl) {
            return quickSort(sort,l,j,k);
        }

        return quickSort(sort,j+1,r,k - sl);

    }
}
