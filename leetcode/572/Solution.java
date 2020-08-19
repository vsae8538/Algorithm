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

  public boolean isSubtree(TreeNode s, TreeNode t) {
      if (t == null) return true;   
      if (s == null) return false; 
      return isSubtree(s.left, t) || isSubtree(s.right, t) || isSameTree(s,t);
  }
  public boolean isSameTree(TreeNode s, TreeNode t){
      if (s == null && t == null) return true;
      if (s == null || t == null) return false;
      if (s.val != t.val) return false;
      return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
  }
}
