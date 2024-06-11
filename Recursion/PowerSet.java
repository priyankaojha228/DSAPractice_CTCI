package Recursion;
import java.util.*;
public class PowerSet {
    private List<List<Integer>> output = new ArrayList();
    private void solve(int i,int[] nums, List<Integer> res) {
        output.add(new ArrayList<>(res));
        for(int j=i;j<nums.length;j++){
            if (j != i && nums[j] == nums[j - 1]) {
                continue;
            }
            res.add(nums[j]);
            solve(j + 1, nums, res);
            res.remove(res.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(0, nums,new ArrayList<Integer>());
        return output;

    }
}
