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

    public int findCenter(int[][] e) {
        return e[0][0] == e[1][0] || e[0][0] == e[1][1] ? e[0][0] : e[0][1];
    }

    // public int findCenter(int[][] edges) {
    //     Map<Integer,Integer> map = new HashMap<>();
    //     int res = edges[0][0];
        
    //     for(int i = 0;i < edges.length;i++){
    //         map.put(edges[i][0], map.getOrDefault(edges[i][0], 0) + 1);
    //         map.put(edges[i][1], map.getOrDefault(edges[i][1], 0) + 1);
    //     }

    //     for(int n : map.keySet()){
    //         if(map.get(res) < map.get(n)){
    //             res = n;
    //         }
    //     }

    //     return res;
    // }
}
