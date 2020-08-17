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

    TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || p == null) return null;
        trackTree(root, p, q);
        return res;
    }

    public boolean trackTree(TreeNode root,TreeNode p, TreeNode q){
        if(root == null) return false;
        boolean b = false;
        if(root.val == p.val || root.val == q.val){
            b = true;
        };
        boolean left = trackTree(root.left, p, q);
        boolean right = trackTree(root.right, p, q);
        if((b == true && left == true) || (left == true && right == true) ||(b == true && right == true)) 
            res = root;
        return b || left || right;
    }
}
