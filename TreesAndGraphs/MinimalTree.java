package TreesAndGraphs;

class MinimalTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length-1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode n = new TreeNode(nums[mid]);
        n.left = sortedArrayToBST(nums, start, mid-1);
        n.right = sortedArrayToBST(nums, mid+1, end);
        return n;
    }
}
