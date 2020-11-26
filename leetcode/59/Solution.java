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

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        dfs(res, 1, 0, 0, n, false);
        return res;
    }
    
    public void dfs(int[][] res, int count, int i, int j, int n, boolean isGoingUp){
        if(i >= n || j >= n || i < 0 || j < 0 || res[i][j] != 0){
            return;
        }
        res[i][j] = count;
        count++;
        if(isGoingUp){
            dfs(res, count, i-1, j, n, true);
        }

        dfs(res, count, i, j+1, n, false);
        dfs(res, count, i+1, j, n, false);
        dfs(res, count, i, j-1, n, false);
        dfs(res, count, i-1, j, n, true);
    }
}