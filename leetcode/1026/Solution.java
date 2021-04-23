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

import javax.swing.tree.TreeNode;

class Solution{

    int max;
    public int maxAncestorDiff(TreeNode root) {
        max = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode n = q.poll();
            dfs(n, n.val);
            if(n.left != null) q.offer(n.left);
            if(n.right != null) q.offer(n.right);
        }

        return max;
    }

    public void dfs(TreeNode root, int ancestorVal){
        if(root == null) return;
        max = Math.max(max, Math.abs(root.val - ancestorVal));
        dfs(root.left, ancestorVal);
        dfs(root.right, ancestorVal);
    }

}
