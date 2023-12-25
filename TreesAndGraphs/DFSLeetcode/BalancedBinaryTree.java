package TreesAndGraphs.DFSLeetcode;

import TreesAndGraphs.TreeNode;
/*Given a binary tree, determine if it is
height-balanced
.*/
public class BalancedBinaryTree {
    public int checkheight(TreeNode root){
        if(root==null){
            return -1;
        }
        int leftheight = checkheight(root.left);
        if(leftheight==Integer.MIN_VALUE){return Integer.MIN_VALUE;}

        int righttheight = checkheight(root.right);
        if(righttheight==Integer.MIN_VALUE){return Integer.MIN_VALUE;}

        int diff = Math.abs(leftheight - righttheight);
        if(diff>1){
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(leftheight,righttheight)+1;}
    }

    public boolean isBalanced(TreeNode root) {

        return checkheight(root)!=Integer.MIN_VALUE;


    }
}
