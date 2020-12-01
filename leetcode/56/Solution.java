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
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);

        int[] cur = intervals[0];
        List<int[]> list = new ArrayList<>();
        for(int i = 1;i < intervals.length;i++){
            if(cur[1] >= intervals[i][0]){
                cur = new int[]{Math.min(cur[0], intervals[i][0]), Math.max(cur[1], intervals[i][1])};
            }else{
                list.add(cur);
                cur = intervals[i];
            }
        }        
        list.add(cur);

        return list.toArray(new int[list.size()][]);
    }

    // public int getMax(int a,int b,int c,int d){
    //     return Math.max(a, Math.max(b, Math.max(c, d)));
    // }

    // public int getMin(int a,int b,int c,int d){
    //     return Math.min(a, Math.min(b, Math.min(c, d)));
    // }
}