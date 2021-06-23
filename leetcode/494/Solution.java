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

class Solution{

    /**
     *  dp
     *  轉化01背包 
        1.x - (sum - x) = target
        2.x = target + sum / 2
        bagSize = target + sum / 2
    */
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for(int num : nums) sum += num;
        if(S > sum || (S + sum) % 2 == 1) return 0;
        int target = (S + sum) / 2;

        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int num : nums){
            for(int j = target; j >= num; j--){
                dp[j] = dp[j] + dp[j - num];
            }
        }
        return dp[target];
    }


    /**
     * 記憶化搜索
     */
    // Map<String, Integer> cache = new HashMap<>();
    // public int findTargetSumWays(int[] nums, int target) {
    //     return dfs(nums, 0, target);
    // }

    // public int dfs(int[] nums, int index, int target){
    //     String key = index + "_" + target;
    
    //     if(cache.containsKey(key)){
    //         return cache.get(key);
    //     }

    //     if(target == 0 && index == nums.length){
    //         cache.put(key, 1);
    //         return 1;
    //     }
    //     if(index >= nums.length){
    //         return 0;
    //     }       

    //     int sub = dfs(nums, index + 1, target - nums[index]);
    //     int add = dfs(nums, index + 1, target + nums[index]);
    //     cache.put(key, add + sub);
    //     return cache.get(key);
    // }

    /**
     * DFS

     */
    // public int findTargetSumWays(int[] nums, int target) {
    //     return dfs(nums, 0, target);
    // }

    // public int dfs(int[] nums, int index, int target){
    //     if(target == 0 && index == nums.length){
    //         return 1;
    //     }
    //     if(index >= nums.length){
    //         return 0;
    //     }       

    //     int sub = dfs(nums, index + 1, target - nums[index]);
    //     int add = dfs(nums, index + 1, target + nums[index]);

    //     return add + sub;
    // }

}
