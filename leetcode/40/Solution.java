import java.math.BigDecimal;
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

    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, 0, 0, target, new LinkedList<>());
        return res;
    }

    public void dfs(int[] candidates, int start, int sum, int target, List<Integer> list){
        if(sum == target){
            res.add(new LinkedList<>(list));
            return;
        }
        if(sum > target){
            return;
        }

        for(int i = start;i < candidates.length;i++){
            if(candidates[i] > target) 
                continue;
            if(i > start && candidates[i] == candidates[i-1])
                continue;
            list.add(candidates[i]);
            sum += candidates[i];
            dfs(candidates, i+1, sum, target, list);
            list.remove(list.size()-1);
            sum -= candidates[i];
        }
    }
}



