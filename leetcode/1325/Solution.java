import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

class Solution {

    public TreeNode removeLeafNodes(TreeNode root, int target) {    
        if(root == null) 
            return null;
        dfs(root, target);
        if(root.left == null && root.right == null && root.val == target){
            return null;
        }else{
            return root;
        }
    }

    public void dfs(TreeNode root,int target){
        if(root == null) 
            return;
        removeLeafNodes(root.left, target);
        removeLeafNodes(root.right, target);
        TreeNode left = root.left;
        TreeNode right = root.right;
        if(left != null && left.left == null && left.right == null && left.val == target){
            root.left = null;
        }
        if(right != null && right.left == null && right.right == null && right.val == target){
            root.right = null;
        }

    }
}
