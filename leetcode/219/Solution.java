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
import java.util.TreeMap;
import java.util.TreeSet;


class Solution {
    /**
     * (i,j) 
     * i - j <= k
     * nums[i] = nums[j]
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
            if(nums == null || nums.length == 0) return false;
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i < nums.length;i++){
                if(map.get(nums[i]) == null){
                    map.put(nums[i], i);
                }else{
                    int n = map.get(nums[i]);
                    map.put(nums[i], Math.abs(n-i));
                    if(n-i > k) return false;
                }
            }
            
        return true;
    }

}



