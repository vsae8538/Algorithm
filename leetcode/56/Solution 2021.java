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
        if(intervals.length == 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> list = new ArrayList<>();
        int pt = 0;
        list.add(new int[]{intervals[0][0],intervals[0][1]});
        for(int i = 1;i < intervals.length;i++){
            int[] x = intervals[i];
            int[] y = list.get(pt);
        
            if(y[1] >= x[0]){
                y[1] = Math.max(x[1], y[1]);
                y[0] = Math.min(x[0], y[0]);
            }
            else{
                list.add(new int[]{x[0],x[1]});
                pt++;
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}