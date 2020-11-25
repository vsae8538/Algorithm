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


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null){
            return null;
        }  
        else if(t1 != null && t2 != null){
            t1.val += t2.val;
        }else if(t1 == null && t2 != null){
            t1 = new TreeNode(t2.val);
        }
        if(t1 != null && t2 != null){
            t1.right = mergeTrees(t1.right, t2.right);
            t1.left = mergeTrees(t1.left, t2.left);
        }

        return t1;
    }


}