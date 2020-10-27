import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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


class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length, m = mat[0].length;
        int[] map = new int[n];
        int[] arr = new int[k];
        int[] mark = new int[n];

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                map[i] += mat[i][j];    
            }
        }
        

        for(int i = 0;i < k;i++){
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for(int j = 0;j < n;j++){
                if(map[j] < min && mark[j] == 0){
                    min = map[j];
                    idx = j;
                }
            }
            mark[idx] = 1;
            arr[i] = idx;
        }
        
        return arr;
    }
}



