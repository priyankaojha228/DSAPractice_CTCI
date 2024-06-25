package DynamicProgramming.DP_MatrixChainMultiplication;
import java.util.*;
public class MinCostToCutStick {
    public int minCost(int n, int[] cuts) {
        ArrayList<Integer> cut = new ArrayList<>();
        cut.add(0);
        for(int i=0;i<cuts.length;i++){
            cut.add(cuts[i]);
        }
        cut.add(n);
        Collections.sort(cut);

        int[][] dp = new int[cuts.length + 1][cuts.length + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return f(1, cuts.length, cut, dp);

    }
    static int f(int i, int j, ArrayList<Integer> cuts, int[][] dp) {
        // Base case
        if (i > j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int mini = Integer.MAX_VALUE;

        for (int ind = i; ind <= j; ind++) {
            int ans = cuts.get(j + 1) - cuts.get(i - 1) +
                    f(i, ind - 1, cuts, dp) +
                    f(ind + 1, j, cuts, dp);

            mini = Math.min(mini, ans);
        }

        return dp[i][j] = mini;
    }
}
