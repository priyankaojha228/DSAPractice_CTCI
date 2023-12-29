package TreesAndGraphs.DFSLeetcode;

import TreesAndGraphs.TreeNode;
/*Given the root of a binary tree, construct a string consisting of parenthesis and integers from a binary tree with the preorder traversal way, and return it.

Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.

Input: root = [1,2,3,4]
Output: "1(2(4))(3)"*/
public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode root) {
        StringBuilder str = new StringBuilder();
        traversal(root,str);
        return str.toString();
    }
    public static void traversal(TreeNode root, StringBuilder str){
        if(root!=null){
            str.append(root.val);
            if(root.left==null && root.right==null){return;}
            str.append("(");
            traversal(root.left,str);
            str.append(")");
            if(root.right!=null){
                str.append("(");
                traversal(root.right,str);
                str.append(")");
            }

        }
    }
}
