package DynamicProgramming;
import java.util.*;
public class MinCostClimbingStairs {
    private HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    private int[] cost;
    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        return dp(cost.length);
    }

    private int dp(int i) {
        if (i <= 1) return 0;


        if(!memo.containsKey(i)){
            memo.put(i, Math.min(dp(i - 1)+cost[i-1], dp(i - 2)+cost[i-2]));
        }
        return memo.get(i);
    }
}
