package TreesAndGraphs.DFSLeetcode;

import TreesAndGraphs.TreeNode;
/*Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.*/
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        return pathSum(root,targetSum,sum);

    }
    public static boolean pathSum(TreeNode root, int targetSum, int sum){
        if(root==null){return false;}
        if(root.left==null && root.right==null){
            sum+=root.val;
            if(sum==targetSum){
                return true;
            }
        }
        return pathSum(root.left, targetSum,sum+root.val) || pathSum(root.right,targetSum,sum+root.val);
    }
}
