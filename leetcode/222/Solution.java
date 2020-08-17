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

    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // public int countNodes(TreeNode root) {
    //     if(root == null) return 0;
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.offer(root);
    //     int res = 0;
    //     while(!queue.isEmpty()){
    //         TreeNode node = queue.poll();
    //         res++;
    //         if(node.left != null) queue.offer(node.left);
    //         if(node.right != null) queue.offer(node.right);
    //     }
    //     return res;
    // }
}
