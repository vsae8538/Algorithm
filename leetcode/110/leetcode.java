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

    public static void main(String[] args) {    
        
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        boolean b = true;
        int left = getTreeDepth(root.left, 0);
        int right = getTreeDepth(root.right, 0);
        System.out.println("left:"+left+"right:"+right);
        if(Math.abs(left - right) > 1){
            b = false;
        }
        boolean left_res = isBalanced(root.left);
        boolean right_res = isBalanced(root.right);
        return b && left_res && right_res;
    }

    public int getTreeDepth(TreeNode root,int dp){
        if(root == null){
            return dp;
        }
        int left = getTreeDepth(root.left, dp+1);
        int right = getTreeDepth(root.right, dp+1);
        return Math.max(left, right);
    }

}
