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

    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> (dist(a) - dist(b)));
        int[][] res = new int[K][2];
        for(int i = 0;i < points.length;i++){
            heap.offer(points[i]);
        }
        for(int i = 0;i < K;i++){
            res[i] = heap.poll();
        }
        return res;
    }

    public int dist(int a[]){
        return (a[0] * a[0]) + (a[1] * a[1]);
    }


}



