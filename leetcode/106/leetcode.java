import java.lang.reflect.Array;
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

class leetcode {

    public static void main(String[] args) {    
        
    }

    int post_idx;
    int[] postorder;
    int[] inorder;
    HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();
  
    public TreeNode helper(int in_left, int in_right) {
      if (in_left > in_right)
        return null;
      int root_val = postorder[post_idx];
      TreeNode root = new TreeNode(root_val);

      int index = idx_map.get(root_val);

      post_idx--;

      root.right = helper(index + 1, in_right);

      root.left = helper(in_left, index - 1);
      return root;
    }
  
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      this.postorder = postorder;
      this.inorder = inorder;

      post_idx = postorder.length - 1;
  
      int idx = 0;
      for (Integer val : inorder)
        idx_map.put(val, idx++);
      return helper(0, inorder.length - 1);
    }

}
