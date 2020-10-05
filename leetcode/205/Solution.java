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

    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        int len = s.length();
        for(int i = 0;i < len;i++){
            if(!map.containsKey(s.charAt(i))){
                if(!map.containsValue(t.charAt(i))){
                    map.put(s.charAt(i),t.charAt(i));
                }
            }else{
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
        }
        String res = "";
        for(int i = 0;i < len;i++){
            res = res + map.get(s.charAt(i));
        }
        if(res.equals(t)){
            return true;
        }else{
            return false;
        }
    }

}



