package TreesAndGraphs.DFSLeetcode;

import TreesAndGraphs.TreeNode;
import java.util.*;
public class MinAbsoluteDiffinBST {
    public int getMinimumDifference(TreeNode root) {
        Set<Integer> arr = new TreeSet<>();
        int diff = Integer.MAX_VALUE;
        traversal(root,arr);
        int[] res = new int[arr.size()];
        int j=0;
        for(int i:arr){
            res[j]=i;
            j++;
        }
        for(int i=0;i<res.length-1;i++){
            int val = res[i+1]-res[i];
            if(val<diff){
                diff=val;
            }
        }
        return diff;

    }
    public static void traversal(TreeNode root, Set<Integer> arr){
        if(root!=null){
            traversal(root.left,arr);
            arr.add(root.val);
            traversal(root.right,arr);
        }
    }

    int min = Integer.MAX_VALUE;
    Integer prev = null;

    public int getMinimumDifferenceBetterApproach(TreeNode root) {
        if (root == null) return min;

        getMinimumDifference(root.left);

        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;

        getMinimumDifference(root.right);

        return min;
    }
}
