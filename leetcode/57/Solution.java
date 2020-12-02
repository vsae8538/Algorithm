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
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[] tmp = new int[]{newInterval[0], newInterval[1]};
        boolean put = false;
        List<int[]> list = new ArrayList<>();
        for(int[] interval : intervals){
            if(interval[0] > tmp[1]){
                if(!put){
                    list.add(new int[]{tmp[0],tmp[1]});
                    put = true;
                }
                list.add(new int[]{interval[0], interval[1]});
            }else if(interval[1] < tmp[0]){
                list.add(new int[]{interval[0], interval[1]});
            }else{
                tmp[0] = Math.min(tmp[0], interval[0]);
                tmp[1] = Math.max(tmp[1], interval[1]);
            }
        }   

        if(!put){
            list.add(new int[]{tmp[0],tmp[1]});
        }

        return list.toArray(new int[list.size()][]);
    }

}