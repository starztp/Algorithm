package com.tianyou.OfferInterview.Alibaba;

/**
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 *
 *
 * 示例 1：
 *
 * 输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
 * 输出：7
 * 解释：因为路径 1→3→1→1→1 的总和最小。
 *
 * 示例 2：
 *
 * 输入：grid = [[1,2,3],[4,5,6]]
 * 输出：12
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinPathSum {

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int column=grid[0].length;
        int row=grid.length;
        //定义dp[][],计算每一格的最小路径
        int[][] dp=new int[row][column];

        dp[0][0]=grid[0][0];

        //计算第一列每一格的和并填充到dp中
        for(int i=1;i<row;i++){
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }

        //计算第一行每一格的和并填充到dp中
        for(int i=1;i<column;i++){
            dp[0][i]=dp[0][i-1]+grid[0][i];
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<column;j++){
                dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j])+grid[i][j];
            }
        }
        return dp[row-1][column-1];
    }
}
