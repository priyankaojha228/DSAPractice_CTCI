package DynamicProgramming.DP_Strings;
import java.util.*;
public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        int[][] dp = new int[n][m];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans = memo(dp,n-1,m-1,s,p);
        return (ans==1?true:false);

    }
    public int memo(int[][] dp, int i, int j, String text1, String text2){
        if(i<0 && j<0){return 1;}
        if(j<0 && i>=0){return 0;}
        if(i<0 && j>=0){
            for(int a=j;a>=0;a--){
                if(text2.charAt(a)!='*'){
                    return 0;
                }
            }
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j) || text2.charAt(j)=='?'){
            return dp[i][j]=memo(dp,i-1,j-1,text1,text2);
        }
        else{
            if(text2.charAt(j)=='*'){
                return dp[i][j]= (memo(dp,i-1,j,text1,text2)==1 || memo(dp,i,j-1,text1,text2)==1)?1:0;
            }
            else{
                return 0;
            }

        }

    }
}
