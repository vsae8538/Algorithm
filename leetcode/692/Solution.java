import java.math.BigDecimal;
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


class Solution {
  
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> heap = new PriorityQueue<String>(
            (s1, s2) -> map.get(s1).equals(map.get(s2)) ? 
            s2.compareTo(s1) : map.get(s1) - map.get(s2));

        for (String word: map.keySet()) {
            heap.offer(word);
            if(heap.size() > k)
                heap.poll();
        }

        List<String> res = new ArrayList<>();
        while(!heap.isEmpty())
            res.add(heap.poll());
        Collections.reverse(res);
        return res;
    }


}



