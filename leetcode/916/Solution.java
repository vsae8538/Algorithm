import java.lang.reflect.Array;
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

    public List<String> wordSubsets(String[] A, String[] B) {
        int[] count = new int[26], tmp;
        int i;
        for (String b : B) {
            tmp = counter(b);
            for (i = 0; i < 26; ++i)
                count[i] = Math.max(count[i], tmp[i]);
        }
        List<String> res = new ArrayList<>();
        for (String a : A) {
            tmp = counter(a);
            for (i = 0; i < 26; ++i)
                if (tmp[i] < count[i])
                    break;
            if (i == 26) res.add(a);
        }
        return res;
    }

    int[] counter(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) count[c - 'a']++;
        return count;
    }


    /**
     * TLE
     */
    // public List<String> wordSubsets(String[] A, String[] B) {
    //     List<String> list = new ArrayList<>();
    //     Map<String,int[]> map = new HashMap<>();
    //     for(String a : A){
    //         int[] arr = new int[26];
    //         for(char c : a.toCharArray()) arr[c - 'a']++;
            
    //         map.put(a, arr);
    //     }
    //     for(String a : A){
    //         int st = 1;
    //         for(String b : B){
    //             int[] arr = Arrays.copyOf(map.get(a), map.get(a).length);
    //             for(char c : b.toCharArray()){
    //                 if(arr[c - 'a'] <= 0) st = 0;
    //                 arr[c - 'a']--;
    //             }
    //         }
    //         if(st == 1) list.add(a);
    //     }

    //     return list;
    // }

}



