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
import java.util.Random;
import java.util.Scanner;

class Solution{

    /**
     * 
     * dp
     * @param nums
     * @return
     */
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] f = new int[n];
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            int len = 1, prev = i;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    if (f[j] + 1 > len) {
                        len = f[j] + 1;
                        prev = j;
                    }
                }
            }
            f[i] = len;
            g[i] = prev;
        }
        
        int max = -1, idx = -1;
        for (int i = 0; i < n; i++) {
            if (f[i] > max) {
                idx = i;
                max = f[i];
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (ans.size() != max) {
            ans.add(nums[idx]);
            idx = g[idx];
        }
        return ans;
    }
 


    /**
     * 回溯暴力 TLE
     * 
     */
    // List<Integer> res = new ArrayList<>();
    // public List<Integer> largestDivisibleSubset(int[] nums) {
    //     backtrack(nums, 0, new ArrayList<>());
    //     return res;
    // }

    // public void backtrack(int[] nums, int index, List<Integer> list){
    //     if(index == nums.length){
    //         // System.out.println(list);
    //         res = res.size() > list.size() ? res : new ArrayList<>(list);
    //         return;
    //     }

    //     for(int i = index;i < nums.length;i++){
    //         list.add(nums[i]);
    //         if(!vaild(list)){
    //             list.remove(list.size()-1);
    //             backtrack(nums, i + 1, list);
    //         }else{
    //             backtrack(nums, i + 1, list);
    //             list.remove(list.size()-1);
    //         }
    //     }

    // }

    // public boolean vaild(List<Integer> list){
    //     if(list.size() == 1){
    //         return true;
    //     }
    //     for(int i = 0; i < list.size() - 1;i++){
    //         for(int j = i + 1;j < list.size();j++){
    //             int n1 = list.get(i);
    //             int n2 = list.get(j);
    //             if(n1 % n2 != 0 && n2 % n1 != 0){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
}
