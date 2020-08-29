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
     * java對於引用類型都是穩定排序
     * merge sort(合併排序) 
     */

    public String arrangeWords(String text) {
        String t[]=text.toLowerCase().split(" ");
        Arrays.sort(t,(s1,s2)->{return s1.length()-s2.length();});
        String ans="";
        for(String a:t){
            ans+=a+" ";
        }
        return (ans.substring(0,1).toUpperCase()+ans.substring(1)).trim();
    }

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



