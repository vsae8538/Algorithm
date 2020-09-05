import java.lang.reflect.Array;
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


    /**
     * 固定滑動窗口大小

     */
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        char[] chars = s.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= chars.length - minSize; i++) {
            if (counter(chars, i, i + minSize - 1) <= maxLetters) {
                String key = String.valueOf(chars, i, minSize);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        int max = 0;
        for (Integer value : map.values()) 
            max = Math.max(max, value);
        return max;
    }

    private int counter(char[] chars, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i <= end; i++) {
            set.add(chars[i]);
        }
        return set.size();
    }

}



