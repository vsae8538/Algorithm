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
     * arr[0]:入
     * arr[1]:出
     * 
     * [2,1][4,1]
     * [3,2][4,2]
     * [5,3]
     * [5,4]

     */


    /**
     * 拓樸排序 (BFS版)
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> edges = new ArrayList<>();
        int[] indeg = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int visited = 0;

        for (int i = 0; i < numCourses; ++i) {
            edges.add(new ArrayList<Integer>());
        }

        for(int i = 0;i < prerequisites.length;i++){
            indeg[prerequisites[i][0]]++;
            edges.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
            
        for(int i = 0;i < numCourses;i++){
            if(indeg[i] == 0){
                queue.offer(i);
            }
        }
        
        while(!queue.isEmpty()){
            int edge = queue.poll();
            visited++;
            for(int e : edges.get(edge)){
                indeg[e]--;
                if(indeg[e] == 0){
                    queue.offer(e);
                }
            }
        }

        return visited == numCourses;
    }

}



