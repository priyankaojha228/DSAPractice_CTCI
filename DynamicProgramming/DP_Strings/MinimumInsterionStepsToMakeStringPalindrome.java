package DynamicProgramming.DP_Strings;
import java.util.*;
public class MinimumInsterionStepsToMakeStringPalindrome {
    public int minInsertions(String s) {
        StringBuilder text2 = new StringBuilder(s);
        text2.reverse();
        int[][] dp = new int[s.length()][s.length()];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return s.length()-memo(dp,s.length()-1,s.length()-1,s,text2.toString());

    }
    public int memo(int[][] dp, int i, int j, String text1, String text2){
        if(i<0||j<0){return 0;}
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]=1+memo(dp,i-1,j-1,text1,text2);
        }
        return dp[i][j]=Math.max(memo(dp,i-1,j,text1,text2),memo(dp,i,j-1,text1,text2));

    }
}
