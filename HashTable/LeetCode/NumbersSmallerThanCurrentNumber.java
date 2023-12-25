package HashTable.LeetCode;
import java.util.*;
public class NumbersSmallerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> values = new ArrayList<>();
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            values.add(nums[i]);
        }
        Collections.sort(values);
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            int index = values.indexOf(val);
            res[i] = index;
        }
        return res;

    }
}
