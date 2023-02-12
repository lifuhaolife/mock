package com.lfh.mock.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheThirdRootOfNumber {

    public void theThirdRootOfNumber() {

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String input = br.readLine();
        double num = Double.parseDouble(input);
        double l = -100000, r = 100000;
        while (r - l > 1e-8) {
            double mid = (l + r) / 2;
            double temp = mid * mid * mid;
            if (temp >= num) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(String.format("%.6f", l));

    }
}
