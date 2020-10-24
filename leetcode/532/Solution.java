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
     * 
     * 
     * 
     * 1 1 3 4 5
     */
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = 1, len = nums.length, res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while(r < len){
            if(l == r){
                r++;
                continue;
            }
            if(Math.abs(nums[r] - nums[l]) == k){
                if((map.get(nums[r]) == null) || (map.get(nums[r]) != null && map.get(nums[r]) != nums[l])){
                    map.put(nums[r], nums[l]);
                    res++;
                    r++;
                    continue;
                }
                l++;
            }
            else if(Math.abs(nums[r] - nums[l]) > k){
                l++;
            }else{
                r++;
            }
        }
        return res;
    }
}



