package DynamicProgramming.twoD_DP;

public class MinFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        Integer[][] dp = new Integer[m][n];
        int maxi=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            maxi=Math.min(maxi,f(m-1,j,dp,matrix));
        }
        return maxi;

    }
    public int f(int i, int j, Integer[][] dp, int[][] grid){
        if(j<0||j>=grid.length){
            return (int)Math.pow(10,9);
        }
        if(i==0){
            return grid[0][j];
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        return dp[i][j]=Math.min(grid[i][j]+f(i-1,j,dp,grid), Math.min(grid[i][j]+f(i-1,j-1,dp,grid),grid[i][j]+f(i-1,j+1,dp,grid)));
    }
}
