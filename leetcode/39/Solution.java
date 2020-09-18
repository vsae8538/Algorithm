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

    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTracking(candidates, target, 0, new LinkedList<>(), 0);
        return res;
    }

    public void backTracking(int[] nums,int target, int sum, List<Integer> list, int start){
        if(sum >= target){
            if(sum == target) 
                res.add(new LinkedList<>(list));
            return;
        }
        for(int i = start;i < nums.length;i++){
            sum += nums[i];
            list.add(nums[i]);
            backTracking(nums, target, sum, list, i);
            sum -= nums[i];
            list.remove(list.size()-1);
        }
    } 

}



