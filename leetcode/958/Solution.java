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


    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.offer(root); 
        while(!queue.isEmpty()){
            TreeNode t = queue.poll();
            if(t == null) list.add(null);
            else list.add(t.val);
            if(t != null){
                if(t.left == null) queue.offer(null);
                else queue.offer(t.left);
                if(t.right == null) queue.offer(null);
                else queue.offer(t.right);
            }
        }
        for(int i = 0;i < list.size() - 1;i++){
            if(list.get(i) == null && list.get(i+1) != null) return false;
        }
        return true;
    }

    
}