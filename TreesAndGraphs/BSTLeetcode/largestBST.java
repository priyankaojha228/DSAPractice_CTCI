package TreesAndGraphs.BSTLeetcode;

import TreesAndGraphs.TreeNode;

public class largestBST {
    public int largestBSTSubtree(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(isValidBST(root)){
            return count(root);
        }
        return Math.max(largestBSTSubtree(root.left),largestBSTSubtree(root.right));

    }
    public boolean isValidBST(TreeNode root) {
        return validate(root,null,null);
    }
    public boolean validate(TreeNode root,Integer low, Integer high){
        if(root==null){return true;}
        if((low!=null && root.val<=low)||(high!=null && root.val>=high)){return false;}
        return validate(root.left,low,root.val) && validate(root.right,root.val,high);
    }
    public int count(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+count(root.left)+count(root.right);

    }
}
