package TreesAndGraphs.DFSLeetcode;

import TreesAndGraphs.TreeNode;

import java.util.*;
/*Given the root of a binary tree, return all root-to-leaf paths in any order.*/

public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr = new ArrayList<>();
        if(root!=null){
            treePath(root,arr,"");
        }
        return arr;
    }
    public static void treePath(TreeNode root, List<String> arr, String str){
        if(root.left==null && root.right==null){
            arr.add(str+root.val);
        }
        if(root.left!=null){treePath(root.left, arr,str+root.val+"->");}
        if(root.right!=null){treePath(root.right, arr,str+root.val+"->");}
    }
}
