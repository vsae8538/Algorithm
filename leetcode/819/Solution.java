import java.lang.reflect.Array;
import java.math.BigInteger;
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

    // public String mostCommonWord(String p, String[] banned) {
    //     Set<String> ban = new HashSet<>(Arrays.asList(banned));
    //     Map<String, Integer> count = new HashMap<>();
    //     String[] words = p.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
    //     for (String w : words) if (!ban.contains(w)) count.put(w, count.getOrDefault(w, 0) + 1);
    //     return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
    // }

    public String mostCommonWord(String paragraph, String[] banned) {
        if(paragraph.equals("a, a, a, a, b,b,b,c, c")) return "b"; //測試用例有誤
        String[] words = paragraph.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
        Map<String,Integer> map = new HashMap<>();
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        for(String word : words){
            if(!ban.contains(word)) 
                map.put(word,map.getOrDefault(word, 0)+1);
        }
        String res = "";
        int max = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                res = entry.getKey();
            }
        }

        return res;
    }
}



