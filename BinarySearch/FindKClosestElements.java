package BinarySearch;
import java.util.*;
/*Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b


Example 1:

Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]*/
public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left=0;
        int right = arr.length-k;
        int mid;
        while(left<right){
            mid = left+(right-left)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i=left;i<left+k;i++){
            res.add(arr[i]);
        }
        return res;
    }
}
