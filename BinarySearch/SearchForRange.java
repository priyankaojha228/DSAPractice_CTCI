package BinarySearch;
/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]*/
public class SearchForRange {
    public int[] searchRange(int[] nums, int target) {
        int firstoccurence = search(nums,target,true);

        if(firstoccurence==-1){
            return new int[]{-1,-1};
        }
        int lastoccurence = search(nums,target,false);

        return new int[]{firstoccurence,lastoccurence};

    }
    public int search(int[] nums, int target, boolean isFirst){
        int mid;
        int left=0;
        int right = nums.length-1;
        while(left<=right){
            mid = left+(right-left)/2;
            if(nums[mid]==target){
                if(isFirst){
                    if(left==mid || nums[mid-1]!=target){
                        return mid;
                    }
                    else{
                        right = mid-1;
                    }
                }
                else{
                    if(right==mid || nums[mid+1]!=target){
                        return mid;
                    }
                    else{
                        left=mid+1;
                    }
                }
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
