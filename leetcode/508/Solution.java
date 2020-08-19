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

    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public int[] findFrequentTreeSum(TreeNode root) {
      List<Integer> list = new ArrayList<>();
      if(root == null) return new int[0];
      postorder(root);
      int maxVal = 1;
      for (Map.Entry<Integer, Integer> e : map.entrySet()) 
          if(maxVal < e.getValue()) maxVal = e.getValue();

      for (Map.Entry<Integer, Integer> e : map.entrySet()) 
          if(e.getValue() == maxVal) list.add(e.getKey());   

      int[] res = new int[list.size()];
      for(int i = 0;i < list.size();i++) 
          res[i] = list.get(i);
      return res;
    }
    public int postorder(TreeNode root){
        if(root == null) return 0;
        int left = postorder(root.left);
        int right = postorder(root.right);
        int sum = root.val + left + right;
        if(map.containsKey(sum)){
          map.put(sum, map.get(sum)+1);
        }else{
          map.put(sum, 1);
        }
        return sum;
    }
}
