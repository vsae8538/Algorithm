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

class Solution {

    public static void main(String[] args) {    
        System.out.print("Hello World\n");
    }

    /**
     * 
     *  postOrder iterative
     * 
     *    1
     *   2 3
     *  4 6 
     * 5
     * 
     * 124563
     * 546231
     * 365421
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return res;
        
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            res.add(0, cur.val);
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            } 
        }
        return res;
    }
}
