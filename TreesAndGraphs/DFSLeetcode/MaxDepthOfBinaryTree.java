package TreesAndGraphs.DFSLeetcode;

import TreesAndGraphs.TreeNode;
/*A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.*/
public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null){return 0;}
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;


    }
}
