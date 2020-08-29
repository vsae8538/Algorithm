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
     * Hash
     * 
     *
     */
    public String arrangeWords(String text) {
       Map<Integer,List> map = new TreeMap<Integer,List>();
       String[] str = text.split(" ");
       for(String s : str){
           int len = s.length();
           if(!map.containsKey(len)){
                List<String> list = new LinkedList<>();
                list.add(s);
                map.put(len,list);
           }else{
                List<String> list = map.get(len);
                list.add(s); 
           }
       }
       StringBuffer sb = new StringBuffer();
       for(Map.Entry<Integer,List> entry : map.entrySet()){
           List<String> list = entry.getValue();
           for(String s : list){
                sb.append(s.toLowerCase()+" ");
           }
       }
       sb.deleteCharAt(sb.length()-1);
       Character c = sb.charAt(0);
       sb.setCharAt(0, c.toUpperCase(c));
       return sb.toString();
    }
}



