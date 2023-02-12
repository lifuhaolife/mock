package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HighPrecisionIncrement {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numA = br.readLine();
        String numB = br.readLine();
        System.out.println(increment(reverseString(numA), reverseString(numB)));
        br.close();
    }

    private static String reverseString(String numA) {

        StringBuilder sb = new StringBuilder();
        for (int i = numA.length() - 1; i >= 0; i--) {
            sb.append(numA.charAt(i));
        }
        return sb.toString();
    }

    private static String increment(String numA, String numB) {
        int t = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numA.length() || i < numB.length(); i++) {
            if (i < numA.length()) {
                t += Integer.parseInt(String.valueOf(numA.charAt(i)));
            }
            if (i < numB.length()) {
                t += Integer.parseInt(String.valueOf(numB.charAt(i)));
            }
            sb.append(t % 10);
            t /= 10;
        }
        if (t != 0) {
            sb.append(t);
        }

        return reverseString(sb.toString());
    }
}
