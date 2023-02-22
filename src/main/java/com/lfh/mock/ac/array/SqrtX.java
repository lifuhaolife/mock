package com.lfh.mock.ac.array;


/**
 * Given a non-negative integer x, return the square root of x rounded down to
 * the nearest integer. The returned integer should be non-negative as well
 * <p>
 * You must not use any built-in exponent function or operator
 */
public class SqrtX {


    public int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }
        int res = 1;

        for (int j = 1; j < x; j++) {
            if (j * j <= x) {
                res = j;
            }
            if (j * j > x) {
                break;
            }
        }
        return res;
    }


    public int sqrtx(int x) {
        int l = 0, r = x;
        while (l <= r) {
            int mid = l + (r - l >> 1);
            if (mid * mid <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l - 1;
    }


}
