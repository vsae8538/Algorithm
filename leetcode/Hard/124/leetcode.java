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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return ans;
    }
    public int maxPath(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0, maxPath(root.left)); 
        int right = Math.max(0, maxPath(root.right));
        ans = Math.max(ans, left + right + root.val);
        return root.val + Math.max(left, right);
    }
}

