import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
  
    }
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) //根節點
            && isMirror(t1.right, t2.left) //節點使用相反比較,右對左,左對右
            && isMirror(t1.left, t2.right);
    }

    //此方法遇到[1,2,2,2,null,2]類似無法解決
   /* List<Integer> left = new ArrayList<Integer>();
    List<Integer> right = new ArrayList<Integer>();
    public boolean isSymmetric(TreeNode root) {    
        preTrack(root.left);
        postTrack(root.right);
        if(left.size() != right.size()) return false;
        for(int i = 0;i < left.size();i++)
            if(left.get(i) != right.get(i)) return false;
        return true;
    }
    //pre-track
    public void preTrack(TreeNode node){
        if(node == null){
            return;
        }
        preTrack(node.left);
        left.add(node.val);
        preTrack(node.right);
    }
    //post-track
    public void postTrack(TreeNode node){
        if(node == null){
            return;
        }
        postTrack(node.right);
        right.add(node.val);
        postTrack(node.left);
    }
    */
}   
