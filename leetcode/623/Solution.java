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

  public TreeNode addOneRow(TreeNode root, int v, int d) {
    if(root == null) return null;
    if(d == 1){
      TreeNode newRoot = new TreeNode(v);
      newRoot.left = root;
      return newRoot;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int dp = 2;
    while(!queue.isEmpty()){
      int size = queue.size();
      for(int i = 0;i < size;i++){
        TreeNode node = queue.poll();
        if(dp == d){
          TreeNode leftNewNode = new TreeNode(v);
          TreeNode rightNewNode = new TreeNode(v);
          leftNewNode.left = node.left;
          rightNewNode.right = node.right; 
          node.left = leftNewNode;
          node.right = rightNewNode;
        }
        if(node.left != null) queue.offer(node.left);
        if(node.right != null) queue.offer(node.right); 
      }
      dp++;
    }

    return root;
  }
  
}
