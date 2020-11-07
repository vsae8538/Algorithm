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
    

    public int kthSmallest(int[][] mat, int k) {
        int col = Math.min(mat[0].length, k);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(0);

        for(int[] row : mat){
            PriorityQueue<Integer> nextPq = new PriorityQueue<>(Collections.reverseOrder());
            for(int n : pq){
                for(int i = 0;i < col;i++){
                    nextPq.offer(n + row[i]);
                    if(nextPq.size() > k){
                        nextPq.poll();
                    }
                }
            }
            pq = nextPq;
        }

        return pq.poll();
    }



}



