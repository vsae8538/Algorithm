import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import java.util.TreeSet;


class Solution {

    
    /**
     * T:5%
     * S:5%
     */
    List<String> list = new LinkedList<>();
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head == null || root == null) return false;
        String numStr = "";
        for(ListNode pt = head;pt != null;pt = pt.next) numStr += pt.val;
        dfs(root,"");
        for(String s : list){
            if(s.indexOf(numStr) != -1) return true;
        }
        return false;
    }
    
    public void dfs(TreeNode root,String s){
        if(root == null){
            list.add(s);
            return;
        }
        s += root.val;
        dfs(root.left, s);
        dfs(root.right, s);
    }
}



