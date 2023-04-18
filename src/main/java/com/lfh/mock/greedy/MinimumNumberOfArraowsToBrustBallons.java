package com.lfh.mock.greedy;

import java.util.Arrays;

/**
 * There are some spherical balloons onto a flat wall
 * that represents the XY-plane. The balloons are represent to 2D integer array points where ponints[i] = [Xstart, Xend]
 * denotes a balloon whose horizontal diameter stretches between X start and X end.
 * You do not konw the exat y-coordinates of the balloons.
 * <p>
 * Arrows can be shot up directly vertically( int the positive y-direction) from
 * different points along the x-axis. A balloon with X start and X end is burst by an
 * arrow shot at x if Xstart <= x <= Xend. There is no limit to the number of arrows
 * that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons
 * in its path.
 * Given the array points, return the minimum number of the arrows that must be shot
 * to burst all balloons.
 * <p>
 * <p>
 * how to answer the question?
 * step 1:
 * we should sort the arrays. when arrows can be shot up directly vertically from different
 * points along  the x-axis.
 * Step 2:
 * if the balloons nearby the last one, we need one arrow just so so . neither nor we need
 * decreament the number of arrows.
 */
public class MinimumNumberOfArraowsToBrustBallons {

    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1]) {
                count++;
            }else {
                // 确定气球的右边界进行更新。
                points[i][1] = Math.min(points[i][1], points[i - 1][1]);
            }
        }
        return count;
    }
}
