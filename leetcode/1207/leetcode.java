import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {    

    }
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            if(map.containsKey(n))
                map.put(n, map.get(n) + 1);
            else
                map.put(n, 1);
        }
        HashSet<Integer> set = new HashSet<>();
        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet){
            Integer n = map.get(key);
            if(set.contains(n))
                return false;
            else
                set.add(n);
        }
        return true;
    }
}

