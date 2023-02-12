package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitalSearch {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int nums = Integer.parseInt(input[0]);
        int searchTime = Integer.parseInt(input[1]);
        int time = searchTime;
        int[] arr = new int[nums];
        String[] data = reader.readLine().split(" ");
        for (int i = 0; i < nums; i++) {
            arr[i] = Integer.parseInt(data[i]);
        }

        while (searchTime-- > 0) {
            int num = Integer.parseInt(reader.readLine());
            searchData(arr, num);
        }
        reader.close();

    }

    private static void searchData(int[] arr, int num) {
        int length = arr.length;
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int mid = l + r >> 1;
            if (arr[mid] >= num) {
                r = mid;
            } else {
                l = mid + 1;
            }

        }

        if (arr[l] != num) {
            System.out.println("-1 -1");
        } else {
            System.out.printf(l + " ");
            l = 0;
            r = length - 1;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (arr[mid] <= num) {
                    l = mid;
                } else {
                    r = mid - 1;
                }
            }
            System.out.println(l);
        }
    }
}
