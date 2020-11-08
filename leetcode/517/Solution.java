import java.math.BigDecimal;
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


class Solution {

    //前綴和

    // public int subarraySum(int[] nums, int k) {
    //     int[] preSum = new int[nums.length+1];
    //     int res = 0;
    //     preSum[0] = 0;
    //     for(int i = 0;i < nums.length;i++){
    //         preSum[i+1] = preSum[i] + nums[i]; 
    //     }   

    //     for(int i = 0;i < nums.length;i++){
    //         for(int j = i;j < nums.length;j++){
    //             if(preSum[j+1] - preSum[i] == k){
    //                 res++;
    //             }
    //         }
    //     }
    //     return res;
    // }


    // public int subarraySum(int[] nums, int k) {
    //     int count = 0, pre = 0;
    //     HashMap < Integer, Integer > mp = new HashMap < > ();
    //     mp.put(0, 1);
    //     for (int i = 0; i < nums.length; i++) {
    //         pre += nums[i];
    //         if (mp.containsKey(pre - k)) {
    //             count += mp.get(pre - k);
    //         }
    //         mp.put(pre, mp.getOrDefault(pre, 0) + 1);
    //     }
    //     return count;
    // }


}



