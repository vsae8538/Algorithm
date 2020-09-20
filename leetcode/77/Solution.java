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
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1, new LinkedList<>());
        return res;
    }

    public void backtracking(int n, int k,int index,List<Integer> list){
        if(list.size() == k){
            res.add(new LinkedList<>(list));
            return;
        }

        for(int i = index;i <= n;i++){
            list.add(i);
            backtracking(n, k, i+1, list);
            list.remove(list.size()-1);
        }
    }


}



