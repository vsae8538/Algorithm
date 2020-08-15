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
    /**
     * 
     *      1
           2 
          3 
         4
        5
     */
    // [5,4,8,11,null,13,4,7,2,null,null,null,1]
    // 22
    // [1,2,null,3,null,4,null,5]
    // 6
    // []
    // 1
    // [1]
    // 1

    int distSum;
    boolean res = false;
    public void trackTree(TreeNode root, int sum){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(distSum == sum+root.val) res = true;
        }
        trackTree(root.left, sum+root.val);
        trackTree(root.right, sum+root.val);
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return true;
        this.distSum = sum;
        trackTree(root, 0);
        return res;
    }
}
