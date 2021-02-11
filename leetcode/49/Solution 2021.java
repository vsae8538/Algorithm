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

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null) return null;

        //Arrays.sort(strs);

        Map<String,List> map = new HashMap<>();
        for(String s : strs){
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String tmp = String.valueOf(cs);

            if(map.containsKey(tmp)){
                List<String> list = map.get(tmp);
                list.add(s);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(tmp, list);
            }

        }
        
        return new ArrayList<>(map.values());
    }

}