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

     */
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int length = nums.length;

        if (length == 1) {
            return nums[0];
        }
        
        int[] dp = new int[length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]); //選金額大的那間偷

        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        
        return dp[length - 1];
    }




    /**
     * 
     * 
     * dp 
     * 
     * 
     */

    // public int rob(int[] nums) {
    //     if(nums.length == 1){
    //         return nums[0];
    //     }
    //     int[] dp = new int[nums.length];
    //     dp[0] = nums[0];
    //     dp[1] = nums[1];

    //     for(int i = 2;i < nums.length;i++){
    //         int max = 0;
    //         for(int j = i - 2;j >= 0;j--){
    //             max = Math.max(dp[j] + nums[i], max);
    //         }
    //         dp[i] = max;
    //     }


    //     return Math.max(dp[nums.length-1], dp[nums.length-2]);
    // }



    /**
     * DFS TLE
     */
    // public int rob(int[] nums) {

    //     return dfs(nums, 0, 0);
    // }

    // public int dfs(int []nums, int index, int sum){
    //     if(index >= nums.length){
    //         return sum;
    //     }

    //     int cur = dfs(nums, index + 2, sum + nums[index]);
    //     int next = dfs(nums, index + 1, sum);
        
    //     return Math.max(cur, next);
    // }
}
