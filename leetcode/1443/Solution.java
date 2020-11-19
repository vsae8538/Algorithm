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

    int res = 0;
    boolean[] visited;
    int[] Path;
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        visited = new boolean[n];
        Path = new int[n];

        List<List<Integer>> nodeMap = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            nodeMap.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            nodeMap.get(edge[0]).add(edge[1]);
            nodeMap.get(edge[1]).add(edge[0]);
        }

        Arrays.fill(Path, -1);
        buildPath(nodeMap, 0);
        
        visited[0] = true;
        for(int i = 0;i < n;i++){
            if(hasApple.get(i)){
                dfs(i);
            }
        }

        return res * 2;
    }

    public void buildPath(List<List<Integer>> nodeMap, int val) {
        for (int pairVal : nodeMap.get(val)) {
            if (pairVal != 0 && Path[pairVal] == -1) {
                Path[pairVal] = val; //Path[to] = from
                buildPath(nodeMap, pairVal);
            }
        }
    }

    public void dfs(int to){
        if(!visited[to]){
            visited[to] = true;
            res++;
            dfs(Path[to]);
        }
    }

}
