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
import java.util.TreeSet;

class Solution {

    public int findMinDifference(List<String> timePoints) {
        int mm = Integer.MAX_VALUE;
        List<Integer> time = new ArrayList<>();
        
        for(int i = 0; i < timePoints.size(); i++){
            Integer h = Integer.valueOf(timePoints.get(i).substring(0, 2));
            time.add(60 * h + Integer.valueOf(timePoints.get(i).substring(3, 5)));
        }
        
        Collections.sort(time, (Integer a, Integer b) -> a - b);
        
        for(int i = 1; i < time.size(); i++){
            //System.out.println(time.get(i));
            mm = Math.min(mm, time.get(i) - time.get(i-1));
        }
        
        //比較最後一個和第一個差距 23:59 - 00:00 (循環)
        int corner = time.get(0) + (1440 - time.get(time.size()-1));
        return Math.min(mm, corner);
    }
}



