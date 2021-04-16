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
    public int removeCoveredIntervals(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        for(int i = 0;i < intervals.length;i++){
            int[] arr = intervals[i];
            int st = 0;
            for(int j = 0;j < intervals.length;j++){
                if(i == j) continue;
                if(isCover(arr, intervals[j])){
                    st = 1;
                    break;
                }
            }

            if(st == 0){
                list.add(arr);
            }
        }

        return list.size();
    }

    public boolean isCover(int[] arr, int[] target){
        if(arr[0] <= target[1] && arr[0] >= target[0] 
        && arr[1] <= target[1] & arr[1] >= target[0])
            return true;
        return false;
    }

}
