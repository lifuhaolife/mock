package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSort {



    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        int[] arr = new int[num];
        tmp = new int[num];
        String[] split = reader.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        mergeSort(arr, 0, num - 1);

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        reader.close();

    }
    private static int[] tmp;

    private static void mergeSort(int[] arr, int l, int r) {
        if (l >= r)
            return;
        int mid = l + r >> 1;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = arr[i++];
        }
        while (j <= r) {
            tmp[k++] = arr[j++];
        }

        for (int m = l, n = 0; m <= r; m++, n++) {
            arr[m] = tmp[n];
        }
    }


}
