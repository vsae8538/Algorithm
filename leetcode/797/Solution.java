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


public class Solution {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();        
        path.add(0);
        backTracking(graph, 0, res, path);
        return res;
    }

    public void backTracking(int[][] graph, int node, List<List<Integer>> res, List<Integer> path){
        if(node == graph.length - 1){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int n : graph[node]){
            path.add(n);
            backTracking(graph, n, res, path);
            path.remove(path.size()-1);
        }
    }
}



