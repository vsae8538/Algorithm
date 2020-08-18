import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class Solution {

    public static void main(String[] args) {    
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return null;
        String res = preOrder(root, "");
        return res.substring(1, res.length());
    }

    public String preOrder(TreeNode root,String s){
        if(root == null){
            s += ",null";
            return s;
        }
        s += ","+root.val;
        s += preOrder(root.left, "");
        s += preOrder(root.right, "");
        return s;
    }

    public TreeNode buildTreeByPreOrder(List<String> list){
        if(list.size() < 1) return null;
        TreeNode root;
        if(list.get(0).equals("null")){
            root = null;
            list.remove(0);
            return root;
        }
        Integer val = Integer.valueOf(list.get(0));
        root = new TreeNode(val);
        list.remove(0);
        root.left = buildTreeByPreOrder(list);
        root.right = buildTreeByPreOrder(list);
        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null) return null;
        List<String> list = new ArrayList<>(Arrays.asList(data.split(",")));
        return buildTreeByPreOrder(list);
    }
}
