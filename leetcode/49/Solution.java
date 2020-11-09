import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
     * 20201109
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null) return null;
        Map<String, List> map = new HashMap<>();
        for(String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String s = String.valueOf(c);
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(str);
        }

        return new ArrayList(map.values());
    }


   
}



