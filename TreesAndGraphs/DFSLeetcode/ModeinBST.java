package TreesAndGraphs.DFSLeetcode;
import TreesAndGraphs.TreeNode;

import java.util.*;
public class ModeinBST {
    public static int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        traversal(root,map,max);
        System.out.println(max);
        ArrayList<Integer> arr = new ArrayList<>();
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
            int key = mapElement.getKey();
            int value = mapElement.getValue();
            if(value==max){
                arr.add(key);
                System.out.println(key);
            }
        }
        int[] arr1 = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            arr1[i]=arr.get(i);
        }
        return arr1;

    }
    public static void traversal(TreeNode root, HashMap<Integer,Integer> map, int max){
        if(root!=null){
            traversal(root.left,map,max);
            if(map.containsKey(root.val)){
                map.put(root.val,map.get(root.val)+1);
                if(map.get(root.val)>max){
                    max=map.get(root.val);
                    System.out.println(max);
                }
            }
            else{
                map.put(root.val,1);
                if(1>max){
                    max=1;
                    System.out.println(max);
                }
            }
            traversal(root.right,map,max);
        }
    }
    public static void main(String[] args){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        new TreeNode(1,null,n2);
        new TreeNode(2,null,n2);
        new TreeNode(2,null,null);
        int[] arr = findMode(n1);


    }
}