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


    /*

      1
     2 3
    4   5
    
    */
    int dp = Integer.MAX_VALUE;
    public void getTreeMinDepth(TreeNode root,int n){
        if(root.left == null && root.right == null){
            dp = Math.min(n, dp);
            return;
        }
        if(root.left != null) getTreeMinDepth(root.left, n+1);
        if(root.right != null) getTreeMinDepth(root.right, n+1);
    }

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        getTreeMinDepth(root, 0);
        return dp;
    }
}
