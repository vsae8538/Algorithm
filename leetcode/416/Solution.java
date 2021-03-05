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

    /**
     * (NP=P背包 可用DP) 
     * 
     * 集合方法解
     */
    public boolean canPartition(int[] nums) {

        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        
        if(sum % 2 != 0) return false;
        
        int target = sum / 2;
        Set<Integer> set = new HashSet<>();
        set.add(0);

        for(int n : nums) {
            Set<Integer> sumsToCurrentNum = new HashSet<>();
            for(int s : set) {
                if(s + n == target) return true;
                if(s + n < target) sumsToCurrentNum.add(s+n);
            }
            
            //collect the current sums to parent set
            set.addAll(sumsToCurrentNum);
        }
        
        return false;
    }
}
