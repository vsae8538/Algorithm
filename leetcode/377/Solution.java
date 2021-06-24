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
     * dp
     * 完全背包 - 求組合數
     */
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int i = 1;i <= target;i++){
            for(int j = 0;j < nums.length;j++){
                if(nums[j] <= i){
                    dp[i] += dp[i - nums[j]];
                }
            }
        }

        return dp[target];
    }

    /**
     * 記憶化搜索
     */
    int[] memo;
    public int combinationSum4(int[] nums, int target) {
        memo = new int[target+1];
        Arrays.fill(memo, -1);
        return dfs(nums, target);
    }

    public int dfs(int[] nums, int target) {        
        if(target < 0){
            return 0;
        }else if(target == 0){
            return 1;
        }

        if(memo[target] != -1){
            return memo[target];
        }

        int res = 0;
        for(int num : nums){
            res += dfs(nums, target - num);
        }

        memo[target] = res;
        return memo[target];
    }

}
