package ArraysandStrings.Leetcode;
/*Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0*/
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] leftsum = new int[nums.length];
        int sl=0;
        int[] rightsum = new int[nums.length];
        int sr=0;
        for(int i=0;i<nums.length;i++){
            leftsum[i]=sl;
            sl+=nums[i];
        }
        for(int j=nums.length-1;j>=0;j--){
            rightsum[j]=sr;
            sr+=nums[j];
        }
        for(int i=0;i<nums.length;i++){
            if(leftsum[i]==rightsum[i]){
                return i;
            }
        }
        return -1;
    }
}
