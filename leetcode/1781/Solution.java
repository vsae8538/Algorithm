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

    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0;i < s.length();++i) {
            int[] count = new int[26];
            for (int j = i;j < s.length();++j) {
                char ch = s.charAt(j);
                count[ch - 'a'] += 1;
                int max_value = Integer.MIN_VALUE;
                int min_value = Integer.MAX_VALUE;
                for (Integer value: count) {
                    if (value > 0 && value > max_value) {
                        max_value = value;
                    }
                    if (value > 0 && value < min_value) {
                        min_value = value;
                    }
                }
                ans += (max_value - min_value);
            }
        }
        return ans;
    }


    /**
     * TLE
     * @param s
     * @return
     */
    // public int beautySum(String s) {
    //     Map<Character, Integer> map = new HashMap<>();
    //     int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE , res = 0;
       
    //     StringBuffer sb = new StringBuffer();
        
    //     String[] strArr = getSubStr(s);

    //     for(String str : strArr){
    //         for(Character ch : str.toCharArray()){
    //             map.put(ch, map.getOrDefault(ch, 0)+1);
    //         }

    //         for(Character ch : map.keySet()){
    //             max = Math.max(max, map.get(ch));
    //             min = Math.min(min, map.get(ch));
    //         }

    //         res = res + (max - min);

    //         max = Integer.MIN_VALUE;
    //         min = Integer.MAX_VALUE;
    //         map.clear();
    //     }

    //     return res;
    // }

    // public String[] getSubStr(String s){
    //     List<String> res = new ArrayList<>();
    //     for(int i = 0; i < s.length();i++){
    //         String tmp = new String();
    //         for(int j = i;j < s.length();j++){
    //             tmp += s.charAt(j);
    //             res.add(tmp);
    //         }
            
    //     }


    //     return res.toArray(new String[0]);
    // } 
}

