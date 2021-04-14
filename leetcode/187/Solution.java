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
    
    /**
     * 滑窗 + HashSet */
    public List<String> findRepeatedDnaSequences(String s) {
        int l = 0, r = 10, len = s.length();

        HashSet<String> set = new HashSet<>();
        List<String> res = new ArrayList<>();
        
        if(len < 10) 
            return res;

        while(r <= len){
            String sub = s.substring(l, r);
            if(set.contains(sub) && !res.contains(sub)){
                res.add(sub);
            }else{
                set.add(sub);
            }
            l++;
            r++;
        }

        return res;
    }



}
