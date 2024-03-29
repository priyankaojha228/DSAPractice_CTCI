package BinarySearch;

public class SearchInRotatedBinarySearch {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid;
        while(left<=right){
            mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[left]){
                if(nums[left]<=target && nums[mid]>target){
                    right=mid-1;
                }
                else{
                    left=mid+1;

                }}
            else{
                if(nums[right]>=target && target>nums[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }

        }
        return -1;

    }
}
