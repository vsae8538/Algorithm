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

class Solution{ 

    int res = 0;
    int i = 0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return res;
    }

    public void dfs(TreeNode root,int k){
        if(root == null) 
            return;
        dfs(root.left, k);
        i++;
        if(i == k){
            res = root.val;
            return;
        }
        dfs(root.right, k);
    }

}