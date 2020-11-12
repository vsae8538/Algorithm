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
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> res = new ArrayList<>();
        int count = 0;
        List<List<Integer>> map = new ArrayList<>();
        int[] inDegs = new int[numCourses]; 
        Queue<Integer> queue = new LinkedList<>();

        if(numCourses == 1){
            return new int[]{0};    
        }

        for(int i = 0;i < numCourses;i++){
            map.add(new ArrayList<>());
        }

        for(int[] p : prerequisites){
            inDegs[p[0]]++;
            map.get(p[1]).add(p[0]);
        }
    
        for(int i = 0;i < numCourses;i++){
            if(inDegs[i] == 0){
                queue.offer(i);
            }
        }
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size;i++){
                int e = queue.poll();
                count++;    
                List<Integer> neighbors = map.get(e);
                for(int neighbor : neighbors){
                    inDegs[neighbor]--;
                    if(inDegs[neighbor] == 0){
                        queue.offer(neighbor);
                    }
                }
                res.add(e);
            }
        }

        if(count == numCourses)
            return res.stream().mapToInt(i->i).toArray();
        else
            return new int[]{};    
    }

}



