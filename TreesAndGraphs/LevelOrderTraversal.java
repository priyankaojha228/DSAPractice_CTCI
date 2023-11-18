package TreesAndGraphs;

import java.util.*;

class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<Integer>();
        List<TreeNode> current1 = new ArrayList<TreeNode>();
        if(root!=null){
            current.add(root.val);
            current1.add(root);
        }
        while(current1.size()>0){
            result.add(current);
            List<TreeNode> parents = current1;
            current1 = new ArrayList<TreeNode>();
            current = new ArrayList<Integer>();
            for(TreeNode parent:parents){
                if(parent.left!=null){
                    current1.add(parent.left);
                    current.add(parent.left.val);
                }
                if(parent.right!=null){
                    current1.add(parent.right);
                    current.add(parent.right.val);
                }}

        }
        return result;

    }
}
