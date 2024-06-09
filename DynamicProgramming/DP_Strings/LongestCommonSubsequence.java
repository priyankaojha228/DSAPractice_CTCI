package DynamicProgramming.DP_Strings;
import java.util.*;
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return memo(dp,text1.length()-1,text2.length()-1,text1,text2);

    }
    public int memo(int[][] dp, int i, int j, String text1, String text2){
        if(i<0||j<0){return 0;}
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return 1+memo(dp,i-1,j-1,text1,text2);
        }
        return dp[i][j]=Math.max(memo(dp,i-1,j,text1,text2),memo(dp,i,j-1,text1,text2));

    }

}
