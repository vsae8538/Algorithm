import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        
    }
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return paths(root, sum) 
                + pathSum(root.left, sum) 
                + pathSum(root.right, sum);
    }

    private int paths(TreeNode root, int sum) {
        if (root == null) return 0;
        int res = 0;
        if (root.val == sum) res += 1;            
        res += paths(root.left, sum - root.val);
        res += paths(root.right, sum - root.val);
        return res;
    }

}   