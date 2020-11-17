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

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0;i < nums.length;i++){
            long n = (long) nums[i];
            
            Long x = set.ceiling(n);
            if(x != null && x <= t + nums[i]) return true;
            
            Long s = set.floor(n);
            if(s != null && nums[i] <= t + s) return true;
            
            set.add(n);
            if(set.size() > k){ 
                set.remove((long)nums[i - k]);
            }
        }
        return false;
    }
}