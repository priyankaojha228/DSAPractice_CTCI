package DynamicProgramming.DP_MatrixChainMultiplication;
import java.util.*;
public class PalindromePartitioning {
    public int minCut(String s) {
        int n=s.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return f(0, n, s, dp) - 1;

    }
    static boolean isPalindrome(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static int f(int i, int n, String str, int[] dp) {

        if (i == n) return 0;

        if (dp[i] != -1) return dp[i];
        int minCost = Integer.MAX_VALUE;

        for (int j = i; j < n; j++) {
            if (isPalindrome(i, j, str)) {
                int cost = 1 + f(j + 1, n, str, dp);
                minCost = Math.min(minCost, cost);
            }
        }
        return dp[i] = minCost;
    }
}
