package DynamicProgramming.DP_LongestIncreasingSubsequence;
import java.util.*;
public class LongestStringChain {
    static Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();
    public int longestStrChain(String[] words) {
        int n=words.length;
        Arrays.sort(words,comp);
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int maxi=1;
        for(int i=0; i<=n-1; i++){
            for(int prev_index = 0; prev_index <=i-1; prev_index ++){

                if((find(words[i],words[prev_index])) && 1 + dp[prev_index] > dp[i]){
                    dp[i] = 1 + dp[prev_index];
                    if(dp[i]>maxi){
                        maxi=dp[i];
                    }

                }
            }
        }

        return maxi;

    }

    static boolean find(String str1,String str2){
        if (str1.length() != str2.length() + 1) {
            return false;
        }
        int count=0;
        int i=0; int j=0;
        while(i<str1.length()&&j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                count++;
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(count==str2.length()){
            return true;
        }
        return false;

    }
}
