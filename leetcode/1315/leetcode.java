import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {    
        
    }
    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        sum = track(root);
        return sum;
    }
    
    public int track(TreeNode node){
        if(node == null) return 0;
        int s = 0;
        TreeNode rNode = node.right == null ? null : node.right;
        TreeNode lNode = node.left == null ? null : node.left;
        if(node.val % 2 == 0){
            if(rNode != null && rNode.right != null){
                s += rNode.right.val;
            }
            if(rNode != null && rNode.left != null){
                s += rNode.left.val;
            }
            if(lNode != null && lNode.right != null){
                s += lNode.right.val;
            }            
            if(lNode != null && lNode.left != null){
                s += lNode.left.val;
            }

        }
        s += track(node.left);
        s += track(node.right); 
        return s;
    }
}

