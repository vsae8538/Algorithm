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

    public int findBottomLeftValue(TreeNode root) {
        int res = 0;
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
          int size = queue.size();
          for(int i = 0;i < size;i++){
            TreeNode node = queue.poll();
            if(i == 0) res = node.val;
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
          }
        }
        return res;
    }
}
