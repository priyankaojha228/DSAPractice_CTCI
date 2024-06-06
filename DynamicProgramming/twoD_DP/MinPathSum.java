package DynamicProgramming.twoD_DP;
import java.util.*;
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return f(m-1,n-1,dp, grid);

    }
    public int f(int i, int j, int[][] dp, int[][] grid){
        if(i==0 && j==0){
            return grid[0][0];
        }
        if(i<0||j<0){
            return (int) Math.pow(10, 9);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=Math.min(grid[i][j]+f(i-1,j,dp,grid), grid[i][j]+f(i,j-1,dp,grid));
    }
}
