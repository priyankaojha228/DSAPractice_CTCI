package HashTable.LeetCode;
import java.util.*;
/*Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.*/
public class goodPairs {
        public static int numIdenticalPairs(int[] nums) {
            int count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int val : nums) {
                int c = map.getOrDefault(val,0);
                count+=c;
                map.put(val,c+1);
            }
            return count;
        }
    public static void main(String[] args) {
            int nums[] = {1,2,3,1,1,3};
            int value = numIdenticalPairs(nums);
        System.out.println(value);
    }
}
