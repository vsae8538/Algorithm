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

 /*  dp + 後序 */
 public int rob(TreeNode root) {
    int[] dp = helper(root);
    return Math.max(dp[0], dp[1]);
}

public int[] helper(TreeNode root){
    if(root == null){
        return new int[]{0,0};
    }

    int[] left = helper(root.left);
    int[] right = helper(root.right);

    int[] dp = new int[2];
    //偷
    dp[1] = root.val + left[0] + right[0]; 
    //不偷
    dp[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);

    return dp;
}



/**
 * 記憶化搜索
 */
Map<TreeNode,Integer> map = new HashMap<>();
public int rob(TreeNode root) {
    if(root == null){
        return 0;
    }

    if(map.containsKey(root)){
        return map.get(root);
    }

    int val = root.val;
    if(root.left != null){
        val += rob(root.left.left) + rob(root.left.right);
    }
    if(root.right != null){
        val += rob(root.right.left) + rob(root.right.right);
    }

    int val2 = rob(root.left) + rob(root.right);

    map.put(root, Math.max(val2, val));

    return map.get(root);
}


/**
 * DFS TLE 
 * 
 */
// public int rob(TreeNode root) {
//     if(root == null){
//         return 0;
//     }

//     int val = root.val;
//     if(root.left != null){
//         val += rob(root.left.left) + rob(root.left.right);
//     }
//     if(root.right != null){
//         val += rob(root.right.left) + rob(root.right.right);
//     }

//     int val2 = rob(root.left) + rob(root.right);

//     return Math.max(val2, val);
// }
}
