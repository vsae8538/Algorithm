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
     * dp
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        int max = amount + 1;
        Arrays.fill(dp, max);
        dp[0] = 0;
        for(int i = 1;i <= amount;i++){
           for(int j = 0;j < coins.length;j++){
                if(i >= coins[j]){
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
           } 
        }


        return dp[amount] > amount ? -1 : dp[amount];
    }


    /**
     * 記憶化搜索
     */
    // int[] memo;
    // public int coinChange(int[] coins, int amount) {
    //     if(coins.length == 0){
    //         return -1;
    //     }
    //     memo = new int[amount];

    //     return findWay(coins,amount);
    // }

    // public int findWay(int[] coins,int amount){
    //     if(amount < 0){
    //         return -1;
    //     }
    //     if(amount == 0){
    //         return 0;
    //     }

    //     if(memo[amount-1] != 0){
    //         return memo[amount-1];
    //     }
    //     int min = Integer.MAX_VALUE;
    //     for(int i = 0;i < coins.length;i++){
    //         int res = findWay(coins,amount-coins[i]);
    //         if(res >= 0 && res < min){
    //             min = res + 1; 
    //         }
    //     }
    //     memo[amount-1] = (min == Integer.MAX_VALUE ? -1 : min);
    //     return memo[amount-1];
    // }


    /**
     * 暴力2
     * TLE
     * /
    // public int coinChange(int[] coins, int amount) {

    //     int res = backtracking(coins, amount, 0);
    //     return  res == Integer.MAX_VALUE ? -1 : res; 
    // }  

    // public int backtracking(int[] coins, int amount, int bag){
    //     if(amount == 0){
    //         return bag;
    //     }else if(amount < 0){
    //         return Integer.MAX_VALUE;
    //     }

    //     int res = Integer.MAX_VALUE;

    //     for(int i = 0;i < coins.length;i++){
    //         amount -= coins[i];
    //         bag++;
    //         res = Math.min(backtracking(coins, amount, bag), res);
    //         amount += coins[i];
    //         bag--;
    //     }

    //     return res;
    // }

    /**
     * TLE 暴力
     */
    // int res = Integer.MAX_VALUE;
    // public int coinChange(int[] coins, int amount) {
    //    backtracking(coins, amount, 0);
    //    return res == Integer.MAX_VALUE ? -1 : res;
    // }  

    // public void backtracking(int[] coins, int amount, int bag){
    //     if(amount == 0){
    //         res = Math.min(res, bag);
    //         return;
    //     }else if(amount < 0){
    //         return;
    //     }

    //     for(int i = 0;i < coins.length;i++){
    //         amount -= coins[i];
    //         bag++;
    //         backtracking(coins, amount, bag);
    //         amount += coins[i];
    //         bag--;
    //     }

    // }

}
