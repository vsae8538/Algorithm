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
     * dfs O(2^n)
     */
    int res = 0;
    public int findTargetSumWays(int[] nums, int S) {
        dfs(nums, S, 0, 0);
        return res;    
    }
    
    public void dfs(int[] nums, int S, int i, int sum){
        if(i >= nums.length){
            if(sum == S) 
                res++;
            return;
        }

        dfs(nums, S, i+1, sum + nums[i]);
        dfs(nums, S, i+1, sum - nums[i]);
    }

}
