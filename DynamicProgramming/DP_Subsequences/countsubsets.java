package DynamicProgramming.DP_Subsequences;
import java.util.*;
public class countsubsets {
    static int findWaysUtil(int ind, int target, int[] arr, int[][] dp) {
        if (target == 0)
            return 1;

        if (ind == 0)
            return arr[0] == target ? 1 : 0;

        if (dp[ind][target] != -1)
            return dp[ind][target];

        // Calculate the number of ways when the current element is not taken
        int notTaken = findWaysUtil(ind - 1, target, arr, dp);

        // Calculate the number of ways when the current element is taken
        int taken = 0;
        if (arr[ind] <= target)
            taken = findWaysUtil(ind - 1, target - arr[ind], arr, dp);

        // Store and return the result for the current state
        return dp[ind][target] = notTaken + taken;
    }

    // Main function to find the number of ways to form subsets with a target sum
    static int findWays(int[] num, int k) {
        int n = num.length;
        int dp[][] = new int[n][k + 1];

        for (int row[] : dp)
            Arrays.fill(row, -1);

        return findWaysUtil(n - 1, k, num, dp);
    }
}
