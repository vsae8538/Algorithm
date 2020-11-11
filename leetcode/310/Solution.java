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

    /**
     * 
     * 
     * 拓樸排序(BFS-剝洋蔥法)
     * 剝去所有分層的葉節點,最後所得分層節點即為最小高度樹
     * 
     */
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> map = new ArrayList<>();
        int[] degs = new int[n]; //出度(無向圖,表示葉節點往上到父節點)
        Queue<Integer> queue = new LinkedList<>();

        if(n == 1){
            res.add(0);
            return res;
        }

        for(int i = 0;i < n;i++){
            map.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            degs[edge[0]]++;
            degs[edge[1]]++;
            map.get(edge[1]).add(edge[0]);
            map.get(edge[0]).add(edge[1]);
        }

        for(int i = 0;i < n;i++){
            if(degs[i] == 1){ //出度為1的節點入佇列(從邊緣開始剝)
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            res = new ArrayList<>();
            int size = queue.size();
            for(int i = 0;i < size;i++){
                int e = queue.poll();
                res.add(e);
                List<Integer> neighbors = map.get(e);
                for(Integer neighbor : neighbors){
                    degs[neighbor]--; //將相鄰節點出度-1,刪去節點
                    if(degs[neighbor] == 1){
                        queue.offer(neighbor);
                    }
                }
            }
        }

        return res;
    }

}



