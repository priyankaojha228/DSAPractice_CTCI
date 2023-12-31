package TreesAndGraphs.BSTLeetcode;

import TreesAndGraphs.TreeNode;
/*Given the root of a binary search tree and a node p in it, return the in-order successor of that node in the BST. If the given node has no in-order successor in the tree, return null.

The successor of a node p is the node with the smallest key greater than p.val.
Input: root = [2,1,3], p = 1
Output: 2
Explanation: 1's in-order successor node is 2. Note that both p and the return value is of TreeNode type.*/

public class InorderSuccessorinBST {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

        TreeNode sval = null;
        while(root!=null){
            if(p.val>=root.val){
                root=root.right;
            }
            else{
                sval=root;
                root=root.left;
            }
        }
        return sval;


    }
}
