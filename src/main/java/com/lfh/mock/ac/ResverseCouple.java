package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ResverseCouple {

    private static int[] tmp ;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        tmp = new int[num];
        String[] s = reader.readLine().split(" ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        System.out.println(mergeSort(arr, 0, num - 1));
        reader.close();
    }

    private static int mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return 0;
        }

        int mid = l + r >> 1;
        int res = 0;
        res += mergeSort(arr,l, mid) + mergeSort(arr,mid + 1, r);
        int k = 0, i = l, j = mid + 1;

        while ( i <= mid && j <= r) {
            if ( arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            }else {
                tmp[k++] = arr[j++];
                res += mid - i + 1;
            }
        }

        while ( i <= mid) {
            tmp[k++] = arr[i++];
        }
        while ( j <= r) {
            tmp[k++] = arr[j++];
        }

        for ( i =l, j = 0; i <= r; i++, j++) {
            arr[i] = tmp[j];
        }

        return res;
    }


}
