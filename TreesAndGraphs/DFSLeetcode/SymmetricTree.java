package TreesAndGraphs.DFSLeetcode;

import TreesAndGraphs.TreeNode;

/*Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).*/
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){return true;}
        return Symmetric(root.left,root.right);

    }
    public static boolean Symmetric(TreeNode n1, TreeNode n2){
        if(n1==null && n2==null){return true;}
        if(n1==null||n2==null){return false;}
        return (n1.val==n2.val && Symmetric(n1.left,n2.right) && Symmetric(n1.right,n2.left));
    }
}
