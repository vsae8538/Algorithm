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

    public boolean wordPattern(String pattern, String s) {
        return myWordPattern1(pattern, s) && myWordPattern2(pattern, s);
    }

    public boolean myWordPattern1(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String[] strs = s.split(" ");
        for(int i = 0;i < pattern.length();i++){
            if(i >= strs.length || i >= pattern.length()) 
                return false;
            char c = pattern.charAt(i);
            if(map.get(c) == null){
                map.put(c, strs[i]);
            }else{  
                if(!map.get(c).equals(strs[i])){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean myWordPattern2(String pattern, String s) {
        Map<String,Character> map = new HashMap<>();
        String[] strs = s.split(" ");
        int idx = 0;
        for(String str : strs){
            if(idx >= strs.length || idx >= pattern.length()) 
                return false;
            if(map.get(str) == null){
                map.put(str, pattern.charAt(idx));
            }else{
                if(map.get(str) != pattern.charAt(idx)){
                    return false;
                }
            }
            idx++;
        }
        return true;
    }

}



