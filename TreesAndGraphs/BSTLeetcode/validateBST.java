package TreesAndGraphs.BSTLeetcode;

import TreesAndGraphs.TreeNode;
/*Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left
subtree
 of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.*/
public class validateBST {
    public boolean isValidBST(TreeNode root) {
        return validate(root,null,null);
    }
    public boolean validate(TreeNode root,Integer low, Integer high){
        if(root==null){return true;}
        if((low!=null && root.val<=low)||(high!=null && root.val>=high)){return false;}
        return validate(root.left,low,root.val) && validate(root.right,root.val,high);
    }
}
