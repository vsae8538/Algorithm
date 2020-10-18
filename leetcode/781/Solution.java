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
 
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap();
        int res = 0;
        for(int num : answers){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num)==1) res += num+1;
            if(map.get(num)>num) map.remove(num);
        }
        return res;
    }

    public int numRabbits(int[] answers) {
        int c[] = new int[1000], res = 0;
        for (int i : answers)
            if (c[i]++ % (i + 1) == 0)
                res += i + 1;
        return res;
    }
}



