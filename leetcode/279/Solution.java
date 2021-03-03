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
    /**
     * BFS
     * @param n
     * @return
     */
    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.offer(0);
        visited.add(0);
        int res = 0;

        while(!queue.isEmpty()){
            res++;
            int size = queue.size();
            for(int i = 0;i < size;i++){
                int curr = queue.poll();
                for(int j = 1;j * j + curr <= n;j++){
                    int num = j * j + curr;
                    if(num == n) return res;
                    if(num < n && !visited.contains(num)){
                        visited.add(num);
                        queue.offer(num);
                    }
                }
            }
        }

        return res;
    }

}
