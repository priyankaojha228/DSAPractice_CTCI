package TreesAndGraphs;
import java.util.*;
/*You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.*/
public class PopulatingNextRightPointersinEachNode {

    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        ArrayList<ArrayList<Node>> result = new ArrayList<>();
        ArrayList<Node> curr = new ArrayList<>();
        curr.add(root);
        while(curr.size()>0){
            result.add(curr);
            ArrayList<Node> parents = curr;
            curr=new ArrayList<>();
            for(int i=0;i<parents.size();i++){
                if(i<parents.size()-1){parents.get(i).next = parents.get(i+1);}
                if(parents.get(i).left!=null){
                    curr.add(parents.get(i).left);
                }
                if(parents.get(i).right!=null){
                    curr.add(parents.get(i).right);
                }
            }
        }

        return root;

    }
}
