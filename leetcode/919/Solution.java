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


    TreeNode root;
    public CBTInserter(TreeNode root) {
        if(root == null) return;
        this.root = root;
    }
    
    public int insert(int v) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode parentNode = null;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
            if(node.left == null || node.right == null){
                parentNode = node;
                break;
            }
        }
        if(parentNode.left == null){
            parentNode.left = new TreeNode(v);
        }else if(parentNode.right == null){
            parentNode.right = new TreeNode(v);
        }
        return parentNode.val;
    }
    
    public TreeNode get_root() {
        return root;
    }

}



