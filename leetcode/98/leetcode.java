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

    /**
     *  10
     * 5 15
     *   6 20 
     */

    public static void main(String[] args) {    
        
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode inOrder = null;
        while(!stack.isEmpty() || root != null){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(inOrder != null && root.val <= inOrder.val) return false;
            inOrder = root;
            root = root.right;
        } 
        return true;
    }
}

