package TreesAndGraphs.DFSLeetcode;

import TreesAndGraphs.TreeNode;
/*Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.*/
public class SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){return 0;}
        if(root.left!=null && root.left.left==null && root.left.right==null){
            return root.left.val+sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);

    }
}
