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

  public List<Integer> largestValues(TreeNode root) {
      List<Integer> res = new ArrayList<>();  
      if(root == null) return res;
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);
      while(!queue.isEmpty()){
        int size = queue.size();
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < size;i++){
          TreeNode node = queue.poll();
          max = Math.max(node.val, max);
          if(node.left !=  null) queue.offer(node.left);
          if(node.right !=  null) queue.offer(node.right);
        }
        res.add(max);
      }
      return res;
  }

}
