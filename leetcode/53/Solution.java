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

    /**
     * 一維DP 同前綴和
     */
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        int[] dp = new int[len];

        dp[0] = nums[0]; 
        for(int i = 1;i < len;i++){
            dp[i] = Math.max(nums[i] + dp[i-1], nums[i]);
        }

        for(int i = 0;i < len;i++){
            max = Math.max(dp[i], max);
            //System.out.print(dp[i] + " ");
        }

        return max;
    }   



    /**
     * 二維DP (MLE)
     */
    // public int maxSubArray(int[] nums) {
    //     int max = Integer.MIN_VALUE;
    //     int len = nums.length;
    //     int[][] dp = new int[len][len];

    //     //題目數值範圍有負值
    //     for(int i = 0;i < len;i++){
    //         for(int j = 0;j < len;j++){
    //             dp[i][j] = Integer.MIN_VALUE;
    //         }
    //     }

    //     for(int i = 0;i < len;i++){
    //         dp[i][i] = nums[i];
    //     }

    //     for(int i = 0;i < len - 1;i++){
    //         for(int j = i + 1;j < len;j++){
    //             dp[i][j] = Math.max(dp[i][j-1] + nums[j], dp[i][j]);
    //         }
    //     }

    //     for(int i = 0;i < len;i++){
    //         for(int j = 0;j < len;j++){
    //             max = Math.max(dp[i][j], max);
    //             //System.out.print(dp[i][j] + " ");
    //         }
    //         //System.out.println();
    //     }

    //     return max;
    // }  

    /*

    暴力2
        */
    // int max = Integer.MIN_VALUE;
    // public int maxSubArray(int[] nums) {
    //     dfs(nums, 0, nums[0]);
    //     return max;
    // }  

    // public void dfs(int nums[] , int index, int sum){
    //     if(index == nums.length){
    //         return;
    //     }

    //     for(int i = index + 1;i < nums.length;i++){
    //         max = Math.max(max, sum);
    //         sum += nums[i];
    //     }
    //     max = Math.max(max, sum);

    //     if(index + 1 < nums.length){
    //         dfs(nums, index + 1, nums[index + 1]);
    //     }

    // }

    /*

    暴力
        */
    // int max = Integer.MIN_VALUE;
    // public int maxSubArray(int[] nums) {
        
    //     for(int i = 0;i < nums.length;i++){
    //         dfs(nums, i, nums[i]);
    //     }

    //     return max;
    // }

    // public void dfs(int nums[] , int index, int sum){
    //     max = Math.max(sum, max);
    //     if(index == nums.length - 1){
    //         return;
    //     }

    //     dfs(nums, index + 1, sum + nums[index + 1]);
    // }

}