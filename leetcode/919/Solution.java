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

    /**
     * 雙端Queue
     */

    TreeNode root;
    Deque<TreeNode> deque;
    public CBTInserter(TreeNode root) {
        this.root = root;
        deque = new LinkedList();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null || node.right == null)
                deque.offerLast(node);
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
        }
    }

    public int insert(int v) {
        TreeNode node = deque.peekFirst();
        deque.offerLast(new TreeNode(v));
        if (node.left == null)
            node.left = deque.peekLast();
        else {
            node.right = deque.peekLast();
            deque.pollFirst();
        }

        return node.val;
    }

    public TreeNode get_root() {
        return root;
    }


    // TreeNode root;
    // public CBTInserter(TreeNode root) {
    //     if(root == null) return;
    //     this.root = root;
    // }
    
    // public int insert(int v) {
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.offer(root);
    //     TreeNode parentNode = null;
    //     while(!queue.isEmpty()){
    //         TreeNode node = queue.poll();
    //         if(node.left != null) queue.offer(node.left);
    //         if(node.right != null) queue.offer(node.right);
    //         if(node.left == null || node.right == null){
    //             parentNode = node;
    //             break;
    //         }
    //     }
    //     if(parentNode.left == null){
    //         parentNode.left = new TreeNode(v);
    //     }else if(parentNode.right == null){
    //         parentNode.right = new TreeNode(v);
    //     }
    //     return parentNode.val;
    // }
    
    // public TreeNode get_root() {
    //     return root;
    // }

}



