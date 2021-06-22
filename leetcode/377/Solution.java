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


    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }

    /**
     * 記憶化搜索
     */
    // int[] memo;
    // public int combinationSum4(int[] nums, int target) {
    //     memo = new int[target+1];
    //     Arrays.fill(memo, -1);
    //     return dfs(nums, target);
    // }

    // public int dfs(int[] nums, int target) {        
    //     if(target < 0){
    //         return 0;
    //     }else if(target == 0){
    //         return 1;
    //     }

    //     if(memo[target] != -1){
    //         return memo[target];
    //     }

    //     int res = 0;
    //     for(int num : nums){
    //         res += dfs(nums, target - num);
    //     }

    //     memo[target] = res;
    //     return memo[target];
    // }

    /**
     * DFS TLE
     * 詳細分析遞歸樹，即可發現不會有重複解問題
     * 
     */
    // public int combinationSum4(int[] nums, int target) {
    //     if(target < 0){
    //         return 0;
    //     }else if(target == 0){
    //         return 1;
    //     }

    //     int res = 0;
    //     for(int num : nums){
    //         res += combinationSum4(nums, target - num);
    //     }

    //     return res;
    // }

    /**
     * 回溯 TLE
     */
    // List<Integer> list = new ArrayList<>();
    // Set<String> set = new HashSet<>();
    // int res = 0;
    // public int combinationSum4(int[] nums, int target) {
    //     backtracking(nums, target);
    //     return res;
    // }

    // public void backtracking(int[] nums, int target){
    //     if(target < 0){
    //         return;
    //     }
    //     else if(target == 0){
    //         if(isDuplicate()){
    //             return;
    //         }else{
    //           res++;
    //           String str = "";
    //           for(int n : list){
    //               str = str + n;
    //           }
    //           set.add(str);  
    //         }
    //         return;
    //     }

    //     for(int i = 0;i < nums.length;i++){
    //         list.add(nums[i]);
    //         backtracking(nums, target - nums[i]);
    //         list.remove(list.size()-1);
    //     }
    // }

    // public boolean isDuplicate(){
    //     String str = "";
    //     for(int n : list){
    //         str = str + n;
    //     }
    //     if(set.contains(str)){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }
}
