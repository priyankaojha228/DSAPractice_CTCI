package TreesAndGraphs.DFSLeetcode;

import TreesAndGraphs.TreeNode;
/*Given the root of a binary tree, invert the tree, and return its root.*/
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if( root != null ){
            // General case:
            // invert child node of current root
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            // invert subtree with DFS
            invertTree(root.left);
            invertTree(root.right);
            return root;

        }else{

            // Base case:
            // empty tree or empty node
            return null;
        }


    }
}
