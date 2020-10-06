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

    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0, res = arr[0];
        for(int i : arr) map.put(i, map.getOrDefault(i, 0)+1);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(max < entry.getValue()){
                res = entry.getKey();
                max = entry.getValue();
            }
        }
        return res;
    }

}



