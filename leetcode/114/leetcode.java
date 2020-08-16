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

import jdk.nashorn.api.tree.Tree;

class leetcode {

    public static void main(String[] args) {    
        
    }

    Queue<Integer> queue = new LinkedList<>();
    public void flatten(TreeNode root) {
        preOrder(root);
        buildRightSkewedTree(root);
    }

    public void buildRightSkewedTree(TreeNode root){
        if(queue.isEmpty()) return;
        if(root.left != null) root.left = null;
        root.val = queue.poll();
        if(root.right == null && !queue.isEmpty()){
            root.right = new TreeNode();
        }
        buildRightSkewedTree(root.right);
    }

    public void preOrder(TreeNode root){
        if(root == null) return;
        queue.offer(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
