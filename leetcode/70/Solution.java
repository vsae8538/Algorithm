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
     * dp 空間優化
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int n1 = 1, n2 = 1;

        for(int i = 2;i <= n;i++){
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }

        return n2;
    }

    /**
     * dp
     * @param n
     * @return
     */
    // public int climbStairs(int n) {
    //     int[] dp = new int[n+1];
    //     dp[0] = 1;
    //     dp[1] = 1;

    //     for(int i = 2;i <= n;i++){
    //         dp[i] = dp[i-1] + dp[i-2]; 
    //     }

    //     return dp[n];
    // }

    /**
     * 記憶化搜索
     */
    // int[] memo;
    // public int climbStairs(int n) {
    //     memo = new int[n+1];
    //     Arrays.fill(memo, -1);
    //     return dfs(n);
    // }

    // public int dfs(int n){
    //     if(n < 0){
    //         return 0;
    //     }
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(memo[n] != -1){
    //         return memo[n];
    //     }

    //     int oneStep = dfs(n - 1);
    //     int twoStep = dfs(n - 2);

    //     memo[n] = oneStep + twoStep;
        
    //     return memo[n];
    // }

    /**
     * DFS TLE
     */
    // public int climbStairs(int n) {
    //     return dfs(n);
    // }

    // public int dfs(int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(n < 0){
    //         return 0;
    //     }

    //     int oneStep = dfs(n - 1);
    //     int twoStep = dfs(n - 2);

    //     return oneStep + twoStep;
    // }
 
}
