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
 
    int[] nums1, nums2;
    HashMap<Integer, Integer> freq = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for (int x : nums2) increaseFreq(x, 1);
    }
    private void increaseFreq(int key, int inc) {
        freq.put(key, freq.getOrDefault(key, 0) + inc);
    }
    public void add(int index, int val) {
        increaseFreq(nums2[index], -1);  // Remove old one
        nums2[index] += val;
        increaseFreq(nums2[index], 1);  // Count new one
    }
    public int count(int tot) {
        int ans = 0;
        for (int a : nums1)
            ans += freq.getOrDefault(tot - a, 0); // a + b = tot -> b = tot - a
        return ans;
    }


    /**
     * 
     * OOM
     * 
     *  */
    // int[][] arr;
    // Map<Integer,Integer> map;

    // public FindSumPairs(int[] nums1, int[] nums2) {
    //     arr = new int[nums1.length][nums2.length];
    //     map = new HashMap<>();
    //     for(int i = 0;i < nums1.length;i++){
    //         for(int j = 0;j < nums2.length;j++){
    //             int sum = nums1[i] + nums2[j];
    //             arr[i][j] = sum;
    //             map.put(sum, map.getOrDefault(sum, 0)+1);
    //         }
    //     }
    // }
    
    // public void add(int index, int val) {
    //     for(int i = 0;i < arr.length;i++){
    //         int oldVal = arr[i][index];
    //         int newVal = arr[i][index] + val;
    //         arr[i][index] = newVal;
    //         map.put(oldVal, map.getOrDefault(oldVal, 0) - 1);
    //         map.put(newVal, map.getOrDefault(newVal, 0) + 1);
    //     }
    // }
    
    // public int count(int tot) { 
    //     if(map.get(tot) == null){
    //         return 0;
    //     }else{
    //         return map.get(tot);
    //     }
    // }

}

