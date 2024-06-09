package DynamicProgramming.DP_Strings;
import java.util.*;
public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[][] dp = new int[n][m];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return memo(dp,n-1,m-1,s,t);

    }
    public int memo(int[][] dp, int i, int j, String text1, String text2){
        if(j<0){return 1;}
        if(i<0){return 0;}
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]=memo(dp,i-1,j-1,text1,text2)+memo(dp,i-1,j,text1,text2);
        }
        return dp[i][j]=memo(dp,i-1,j,text1,text2);

    }
}
