package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NonRepeatingSubsequence {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int m = Integer.parseInt(input);

        String[] data = br.readLine().split(" ");

        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(data[i]);
        }

        int res = 0;
        int[] s = new int[100010];
        for (int i = 0, j = 0; i < m; i++) {
            s[a[i]] ++;
            if (s[a[i]] > 1) {
                s[a[j]] --;
                j++;
            }
            res = Math.max(res, i - j + 1);
        }
        System.out.println(res);
        br.close();
    }
}
