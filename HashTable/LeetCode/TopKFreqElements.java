package HashTable.LeetCode;
import java.util.*;
/*Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]*/
public class TopKFreqElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        List<Integer> val = new ArrayList(map.keySet());
        Collections.sort(val, (a,b) -> map.get(b) - map.get(a));
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = val.get(i);
        }
        return res;


    }

}
