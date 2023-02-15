package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JudgeSubSequence {

    static int N = 100010;
    static int[] a = new int[N];
    static int[] b = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int i = 0;
        for (String str : br.readLine().split(" ")) {
            a[i++] = Integer.parseInt(str);
        }
        i = 0;
        for (String str : br.readLine().split(" ")) {
            b[i++] = Integer.parseInt(str);
        }

        i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                i++;
            }
            j++;
        }
        System.out.println(i == n ? "Yes" : "No");
    }

}
