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

    List<Integer> list = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
        track1(root);
        track2(root);
        return list.equals(list2);
    }

    public void track1(TreeNode root){
        if(root == null){
            list.add(null);
            return;
        }
        track1(root.left);
        track1(root.right);
        list.add(root.val);
    }
    
    public void track2(TreeNode root){
        if(root == null){
            list2.add(null);
            return;
        }
        track2(root.right);
        track2(root.left);
        list2.add(root.val);
    }

}