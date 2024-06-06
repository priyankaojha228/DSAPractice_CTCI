package DynamicProgramming.twoD_DP;
import java.util.*;
public class uniquePath {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return f(m-1,n-1,dp);

    }
    public int f(int i, int j, int[][] dp){
        if(i==0 && j==0){
            dp[0][0]=1;
            return 1;
        }
        if(i<0||j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return f(i-1,j,dp)+f(i,j-1,dp);
    }

    public int OptimizedApproach(int m, int n) {
        long answer = 1;
        for (int i = n; i < (m + n - 1); i++) {
            answer *= i;
            answer /= (i - n + 1);
        }
        return (int) answer;

    }
}
