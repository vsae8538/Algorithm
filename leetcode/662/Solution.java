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


    public int widthOfBinaryTree(TreeNode root) {
        Queue<AnnotatedNode> queue = new LinkedList();
        queue.add(new AnnotatedNode(root, 0, 0));
        int curDepth = 0, left = 0, ans = 0;
        while (!queue.isEmpty()) {
            AnnotatedNode a = queue.poll();
            if (a.node != null) {
                queue.add(new AnnotatedNode(a.node.left, a.depth + 1, a.pos * 2));
                queue.add(new AnnotatedNode(a.node.right, a.depth + 1, a.pos * 2 + 1));
                if (curDepth != a.depth) {
                    curDepth = a.depth;
                    left = a.pos;
                }
                ans = Math.max(ans, a.pos - left + 1);
            }
        }
        return ans;
    }
}

class AnnotatedNode {
    TreeNode node;
    int depth, pos;
    AnnotatedNode(TreeNode n, int d, int p) {
        node = n;
        depth = d;
        pos = p;
    }
}





    /*
        GG
    */

    // /**
    //  *        1
    //  *     1      1
    //  *   1   n  n   1 
    //  *  1 n n 1    
    //  * 
    //  * 
    //  *   1
    //  *  2
    //  * @param root
    //  * @return
    //  */
    // public int widthOfBinaryTree(TreeNode root) {
    //     if(root == null) return 0;
    //     else if(root.left == null && root.right == null) return 1;
    //     else if(root.left == null || root.right == null){
    //         if(root.left != null){
    //             if(root.left.right == null && root.left.left == null) return 1;
    //         }
    //         if(root.right != null){
    //             if(root.right.left == null && root.right.right == null) return 1;
    //         }
    //     }
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.add(root);
    //     List<String> list = new ArrayList<>();
    //     while(!queue.isEmpty()){
    //         int size = queue.size();
    //         String s = "";
    //         for(int i = 0;i < size;i++){
    //             TreeNode node = queue.poll();
    //             if(node.left != null){
    //                 queue.offer(node.left);
    //                 s += node.left.val;
    //             }else{
    //                 if(node.right != null){
    //                     if(node.right.left != null || node.right.right !=null)
    //                         s += "###";
    //                     else
    //                         s += "#";
    //                 }else{
    //                     s += "#";
    //                 }
    //             }
    //             if(node.right != null){
    //                 queue.offer(node.right);
    //                 s += node.right.val;
    //             }else{
    //                 if(node.left != null){
    //                     if(node.left.left != null || node.left.right !=null){
    //                         s += "###";
    //                     }
    //                     else
    //                         s += "#";
    //                 }else{
    //                     s += "#";
    //                 }
    //             }
    //         }
    //         list.add(s);
    //     }
    //     list.remove(list.size()-1);
    //     int max = 0;
    //     for(String s : list){
    //         if((s.charAt(0) >= '0' && s.charAt(0) <= '9') &&
    //             (s.charAt(s.length()-1) >= '0' && s.charAt(s.length()-1) <= '9')){
    //             max = Math.max(s.length(), max);
    //         }
    //     }
    //     return max;
    // }

}
