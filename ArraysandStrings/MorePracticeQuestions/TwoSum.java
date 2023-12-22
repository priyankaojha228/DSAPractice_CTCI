package ArraysandStrings.MorePracticeQuestions;
import java.util.*;
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
* Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
* */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int val = target-nums[i];
            if((arr.contains(val)) && (arr.indexOf(val)!=i)){
                res[0] = i;
                res[1] = arr.indexOf(val);
                break;
            }
        }
        return res;

    }

    public int[] betterApproach(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};

    }
    public static void main(String[] args){
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        System.out.println(twoSum(nums,target).toString());

    }
}
