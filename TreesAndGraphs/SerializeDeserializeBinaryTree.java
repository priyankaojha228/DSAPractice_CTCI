package TreesAndGraphs;
import java.util.*;
/*Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.*/
public class SerializeDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return traversal(root, "");

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
        return revtraversal(data_list);

    }

    public String traversal(TreeNode root, String str) {
        if (root == null) {
            str += "null,";
        } else {
            str += Integer.toString(root.val) + ",";
            str=traversal(root.left, str);
            str=traversal(root.right, str);
        }
        return str;
    }

    public TreeNode revtraversal(List<String> l) {
        if (l.get(0).equals("null")) {
            l.remove(0);
            return null;
        }

        TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
        l.remove(0);
        root.left = revtraversal(l);
        root.right = revtraversal(l);

        return root;
    }
}