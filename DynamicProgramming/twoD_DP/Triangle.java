package DynamicProgramming.twoD_DP;
import java.util.*;
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int[][] dp = new int[m][m];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return f(0,0,dp, triangle);

    }
    public int f(int i, int j, int[][] dp, List<List<Integer>> triangle){
        if(i==triangle.size()-1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=Math.min(triangle.get(i).get(j)+f(i+1,j,dp,triangle), triangle.get(i).get(j)+f(i+1,j+1,dp,triangle));
    }
}
