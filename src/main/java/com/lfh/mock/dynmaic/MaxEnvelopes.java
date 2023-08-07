package com.lfh.mock.dynmaic;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给你一个二维整数数组 envelopes ，其中 envelopes[i] = [wi, hi] ，表示第 i 个信封的宽度和高度。
 * <p>
 * 当另一个信封的宽度和高度都比这个信封大的时候，这个信封就可以放进另一个信封里，如同俄罗斯套娃一样。
 * <p>
 * 请计算 最多能有多少个 信封能组成一组“俄罗斯套娃”信封（即可以把一个信封放到另一个信封里面）。
 * <p>
 * 注意：不允许旋转信封。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：envelopes = [[5,4],[6,4],[6,7],[2,3]]
 * 输出：3
 * 解释：最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。
 * 示例 2：
 * <p>
 * 输入：envelopes = [[1,1],[1,1],[1,1]]
 * 输出：1
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= envelopes.length <= 105
 * envelopes[i].length == 2
 * 1 <= wi, hi <= 105
 * 通过次数
 * 104.6K
 * 俄罗斯套娃、
 * 1. 如何能满足全部套娃进去
 * 2. 满足 数组的排列方式
 * 左边按照升序排列， 相同时右边按照降序排列
 * 最后只需要计算右边数组的LIS结果即可。
 */
public class MaxEnvelopes {

    /**
     * @param envelopes
     * @return
     */
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] == b[0] ?
                        b[1] - a[1] : a[0] - b[0];
            }
        });

        int length = envelopes.length;
        int[] height = new int[length];
        for (int i = 0; i < length; i++) {
            height[i] = envelopes[i][1];
        }
        return new LengthOfLIS().lengthOfLIS(height);
    }
}
