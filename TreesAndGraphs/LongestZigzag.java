package TreesAndGraphs;

public class LongestZigzag {
    int maxstep=0;
    public int longestZigZag(TreeNode root) {
        traversal(root,true,0);
        traversal(root,false,0);
        return maxstep;

    }
    public void traversal(TreeNode root, boolean isLeft, int steps){
        if(root==null){
            return;
        }
        maxstep=Math.max(maxstep,steps);
        if(isLeft){
            traversal(root.left,false,steps+1);
            traversal(root.right,true,1);
        }
        else{
            traversal(root.right,true,steps+1);
            traversal(root.left,false,1);
        }
    }
}
