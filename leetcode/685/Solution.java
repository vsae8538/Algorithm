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
 
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;
        Integer[] indegrees = new Integer[n+1];
        for(int i = 0; i < n; i++){
            int[] e = edges[i];
            if(indegrees[e[1]] == null)
                indegrees[e[1]] = i;
            else{
                DSU dsu = new DSU(n + 1);
                dsu.union(0, 1);
                for(int j = 0; j < n; j++){
                    if(j == i) continue;
                    dsu.union(edges[j][0], edges[j][1]);
                }
                return dsu.n == 1 ? e : edges[indegrees[e[1]]]; //若連通量 = 1,表示刪除此邊可構成樹
            }
        }

        //有環
        DSU dsu1 = new DSU(n + 1);
        dsu1.union(0, 1);
        for(int i = 0; i < n; i++){
            int[] e = edges[i];
            if(dsu1.isConnected(e[0], e[1])) //若兩者的父節點相同，表示刪除此邊可構成樹，即多餘邊
                return e;
            dsu1.union(e[0], e[1]);
        }
        return new int[2];
    }
}
class DSU{
    private int[] parents;
    private int[] size;
    public int n;

    DSU(int n){
        this.n = n;
        parents = new int[n];
        for(int i = 0; i < n; i++){
            parents[i] = i;
        }
    }
    public int find(int x){
        if(parents[x] != x){
            parents[x] = find(parents[x]);
        }
        return parents[x];
    }
    public boolean union(int x, int y){
        int u = find(x), v = find(y);
        if(u == v) return false;

        parents[u] = v;
        n--;
        return true;
    }
    public boolean isConnected(int x, int y){
        return find(x) == find(y);
    }

}

