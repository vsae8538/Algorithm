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
import java.util.LinkedList;;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;


class Solution {

    public int furthestBuilding(int[] A, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i < A.length-1;i++){
            int diff = A[i+1] - A[i];
            if(diff > 0)
                pq.add(diff);
            if(pq.size() > ladders)
                bricks -= pq.poll();
            if(bricks < 0)
                return i;
        }
        return A.length - 1;
    }

}



