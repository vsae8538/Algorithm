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
     * 
     * 40 20 40 10
     * sorted: 10 20 40 40
     * 10:1 20:2 40:3 40:3 
     * 100 100 100
     * 100:1
     */
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        HashMap<Integer, Integer> rank = new HashMap<>();
        for (int x : sortedArr) rank.putIfAbsent(x, rank.size() + 1);
        for (int i = 0; i < arr.length; ++i) arr[i] = rank.get(arr[i]);
        return arr;
    }


    /**
     * TLE
     */
    // public int[] arrayRankTransform(int[] arr) {
    //     int[] res = new int[arr.length];
    //     Set<Integer> set = new HashSet<>();
    //     for(int i = 0;i < arr.length;i++){
    //         int rank = 1;
    //         for(int j = 0;j < arr.length;j++){
    //             if(arr[i] > arr[j] && i != j && !set.contains(arr[j])){
    //                 rank++;
    //                 set.add(arr[j]);
    //             }
    //         }
    //         set.clear();
    //         res[i] = rank;
    //     }
    //     return res;
    // }

}



