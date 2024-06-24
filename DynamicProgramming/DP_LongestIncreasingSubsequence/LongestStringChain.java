package DynamicProgramming.DP_LongestIncreasingSubsequence;
import java.util.*;
public class LongestStringChain {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int[] hash=new int[n];
        Arrays.fill(hash,1);

        for(int i=0; i<=n-1; i++){

            hash[i] = i;
            for(int prev_index = 0; prev_index <=i-1; prev_index ++){

                if((nums[prev_index]%nums[i]==0||nums[i]%nums[prev_index]==0) && 1 + dp[prev_index] > dp[i]){
                    dp[i] = 1 + dp[prev_index];
                    hash[i] = prev_index;
                }
            }
        }

        int ans = -1;
        int lastIndex =-1;

        for(int i=0; i<=n-1; i++){
            if(dp[i]> ans){
                ans = dp[i];
                lastIndex = i;
            }
        }

        List<Integer> temp=new ArrayList<>();
        temp.add(nums[lastIndex]);

        while(hash[lastIndex] != lastIndex){
            lastIndex = hash[lastIndex];
            temp.add(nums[lastIndex]);
        }

        Collections.reverse(temp);
        return temp;

    }
}
