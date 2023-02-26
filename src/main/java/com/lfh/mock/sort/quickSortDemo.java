package com.lfh.mock.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quickSortDemo {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num;
        try {
            num = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int[] arr = new int[num];
        String[] res = bufferedReader.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(res[i]);
        }
        quickSort(arr, 0, num - 1);

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        bufferedReader.close();
    }

    private static void quickSort(int[] sort, int l, int r) {
        if (l >= r) {
            return;
        }
        int x = sort[l + r >> 1], i = l - 1, j = r + 1;
        while (i < j) {
            do {
                i++;
            } while (sort[i] < x);
            do {
                j--;
            } while (sort[j] > x);
            if (i < j) {
                int temp = sort[i];
                sort[i] = sort[j];
                sort[j] = temp;
            }
        }
        quickSort(sort, l, j);
        quickSort(sort, j + 1, r);

    }

}
