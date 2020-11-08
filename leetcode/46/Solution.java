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
     *
     * 20201108
     * 
     */
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums, new LinkedList<>());
        return res;
    }

    public void backtracking(int[] nums, List<Integer> list){
        if(list.size() == nums.length){
            res.add(new LinkedList<>(list));
            return;
        }
        
        for(int i = 0;i < nums.length;i++){
            if(list.contains(nums[i])) 
                continue;
            list.add(nums[i]);
            backtracking(nums, list);
            list.remove(list.size()-1);
        }

    }
}



