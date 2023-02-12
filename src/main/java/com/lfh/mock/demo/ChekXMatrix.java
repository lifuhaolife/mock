package com.lfh.mock.demo;

public class ChekXMatrix {


    /***
     * 最基本的办法就是通过便利获取想要的数组对象，
     * @param grid
     */
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int i1 = grid[i][j];
                if (i == j || (i + j) == n - 1) {
                    if (i1 == 0) {
                        return false;
                    }
                } else if (i1 != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
