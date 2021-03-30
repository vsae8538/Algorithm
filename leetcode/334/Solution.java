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


    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) {
            return false;
        }
        int small = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num <= small) {
                small = num;
            }else if(num <= mid) {
                mid = num;
            }else if(num > mid) {
                return true;
            }
        }
        return false;

    }


    /**
     * 前綴和 O(n^2)
     */
    // public boolean increasingTriplet(int[] nums) {
    //     Map<Integer,Integer> prefixMap = new HashMap<>();
    //     int len = nums.length;
    //     for(int i = 0;i < len;i++){
    //         prefixMap.put(i, 0);
    //         for(int j = i + 1;j < len;j++){
    //             if(nums[j] > nums[i])
    //                 prefixMap.put(i, prefixMap.get(i)+1);
    //         }
    //     }

    //     for(int i = 0;i < len;i++){
    //         if(prefixMap.get(i) >= 2){
    //             for(int j = i + 1;j < len;j++){
    //                 if(nums[j] > nums[i] && prefixMap.get(j) >= 1){
    //                     return true;
    //                 }
    //             }
    //         }
    //     }

    //     return false;
    // }


}
