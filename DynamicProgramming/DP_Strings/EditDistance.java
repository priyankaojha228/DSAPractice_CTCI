package DynamicProgramming.DP_Strings;
import java.util.*;
public class EditDistance {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp = new int[n][m];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return memo(dp,n-1,m-1,word1,word2);

    }
    public int memo(int[][] dp, int i, int j, String text1, String text2){
        if(i<0){return j+1;}
        if(j<0){return i+1;}
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return memo(dp,i-1,j-1,text1,text2);
        }
        return dp[i][j]=1+Math.min(memo(dp,i-1,j-1,text1,text2),Math.min(memo(dp,i-1,j,text1,text2),memo(dp,i,j-1,text1,text2)));

    }
}
