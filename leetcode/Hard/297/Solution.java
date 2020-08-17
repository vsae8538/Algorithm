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


    public String rserialize(TreeNode root, String str) {
        if (root == null) {
            str += "None,";
        } else {
            str += str.valueOf(root.val) + ",";
            str = rserialize(root.left, str);
            str = rserialize(root.right, str);
        }
        return str;
    }
  
    public String serialize(TreeNode root) {
        return rserialize(root, "");
    }
  
    public TreeNode rdeserialize(List<String> l) {
        if (l.get(0).equals("None")) {
            l.remove(0);
            return null;
        }
  
        TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
        l.remove(0);
        root.left = rdeserialize(l);
        root.right = rdeserialize(l);
    
        return root;
    }
  
    public TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
        return rdeserialize(data_list);
    }





    /**
     * unfinished
     */

//   // Encodes a tree to a single string.
//   public String serialize(TreeNode root) {    
//     if(root == null) return "[]";
//     List<String> list = new LinkedList<>();
//     Queue<TreeNode> queue = new LinkedList<>();
//     queue.offer(root);
//     while(!queue.isEmpty()){
//         TreeNode node = queue.poll();
//         list.add(String.valueOf(node.val));
//         if(node.left != null) 
//             queue.offer(node.left);
//         if(node.right != null) 
//             queue.offer(node.right);
//     }

//     return new String(list.toString());
// }

// // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//         String replace = data.replace("[","");
//         String replace1 = replace.replace("]","");
//         String replace2 = replace1.replace(" ","");
//         if(replace2.length() < 1) 
//             return null;
//         List<String> list = new ArrayList<String>(Arrays.asList(replace2.split(",")));
//         System.out.println("1:"+list);
//         Queue<String> queue = new LinkedList<>(list);
//         TreeNode root = new TreeNode(Integer.valueOf(queue.poll()));
//         TreeNode pt = root;
//         Queue<TreeNode> queue2 = new LinkedList<>();
//         while(!queue.isEmpty()){
//             if(queue.peek().trim().equals("null")){
//                 pt.left = null;
//             }else{
//                 pt.left = new TreeNode(Integer.valueOf(queue.poll()));
//             }
//             if(queue.peek().trim().equals("null")){
//                 pt.right = null;
//             }else{
//                 pt.right = new TreeNode(Integer.valueOf(queue.poll()));
//             }
//             if(pt.left != null)
//                 queue2.offer(pt.left);
//             if(pt.right != null) 
//                 queue2.offer(pt.right);
//             pt = queue2.poll();
//         }   
//         return root;
//     }
}
