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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums, nums.length, new ArrayList<>());
        return res;
    }

    public void backtracking(int[] nums, int n, List<Integer> list){
        if(list.size() >= n){
            res.add(new LinkedList<>(list));
            return;
        }
        for(int i = 0;i < n;i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            backtracking(nums, n, list);
            list.remove(list.size()-1);
        }
    }

}