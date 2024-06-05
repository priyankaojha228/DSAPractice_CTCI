package DynamicProgramming;
import java.util.*;
public class DeleteandEarn {
    private HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> points = new HashMap<>();
    private int[] nums;

    private int dp(int i) {
        if (i == 0) return 0;
        if (i == 1) return points.getOrDefault(1, 0);
        int gain = points.getOrDefault(i, 0);
        if (!memo.containsKey(i)) {
            memo.put(i, Math.max(dp(i - 1), dp(i - 2) + gain));
        }
        return memo.get(i);
    }

    public int deleteAndEarn(int[] nums) {
        int maxNumber = 0;
        this.nums=nums;
        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }
        System.out.println(points);
        return dp(maxNumber);
    }
}
