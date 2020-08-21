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
     * 
     *   0
     *  1 3
     *   2
     */


    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root, 0);
    }


      public TreeNode dfs(TreeNode root,int dp){
        if(root == null) return null;
        int left = getTreeMaxDepth(root.left, dp+1);
        int right = getTreeMaxDepth(root.right, dp+1);
        TreeNode leftSubTree = dfs(root.left, dp+1);
        TreeNode rightSubTree = dfs(root.right, dp+1);
        if(left > right){
            return leftSubTree; 
        }else if(right > left){
            return rightSubTree;
        }else{
            return root;
        }
    }

    public int getTreeMaxDepth(TreeNode root,int dp){
        if(root == null) return 0;
        return Math.max(getTreeMaxDepth(root, dp+1), getTreeMaxDepth(root.right, dp+1))+1;
    }

}
