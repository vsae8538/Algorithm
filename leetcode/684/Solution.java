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
 
    int parent[];

    public int[] findRedundantConnection(int[][] edges) {
        int nodesCount = edges.length;
        parent = new int[nodesCount + 1];
        for (int i = 1; i <= nodesCount; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < nodesCount; i++) {
            int[] edge = edges[i];
            int node1 = edge[0], node2 = edge[1];
            if (find(node1) != find(node2)) {
                union(node1, node2);
            } else {
                return edge;
            }
        }
        return new int[0];
    }


    public int find(int x){
        while(parent[x] != x){
            x = parent[x];
        }
        return x;
    }

    public void union(int x, int y){
        parent[find(y)] = find(x); 
    }

}