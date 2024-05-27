package TreesAndGraphs.BSTLeetcode;

import TreesAndGraphs.TreeNode;
/*You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.
Example 1:

Input: root = [1,3,null,null,2]
Output: [3,1,null,null,2]
Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.*/
public class RecoverBST {
    TreeNode x = null, y = null, pred = null;

    public void swap(TreeNode a, TreeNode b) {
        int tmp = a.val;
        a.val = b.val;
        b.val = tmp;
    }

    public void findTwoSwapped(TreeNode root) {
        if (root == null) return;
        findTwoSwapped(root.left);
        if (pred != null && root.val < pred.val) {
            y = root;
            if (x == null) x = pred;
            else return;
        }
        pred = root;
        findTwoSwapped(root.right);
    }

    public void recoverTree(TreeNode root) {
        findTwoSwapped(root);
        swap(x, y);
    }
}
