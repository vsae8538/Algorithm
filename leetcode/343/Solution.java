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

    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }

    /**
     * 記憶化搜索
     */
    // int[] memo; 
    // public int integerBreak(int n) {
    //    memo = new int[n+1];
    //    return dfs(n);
    // }

    // public int dfs(int n){
    //     if(memo[n] != 0) {
    //         return memo[n];
    //     }
    //     int res = 0;
    //     for (int i = 1; i <= n - 1; i++) {
    //         res = Math.max(res, Math.max(i * (n - i), i * dfs(n - i))); 
    //     }
    //     memo[n] = res;
    //     return memo[n];
    // }

    /**
     * DFS TLE
     */
    // public int integerBreak(int n) {
    //     return dfs(n, 1, 0, 1);
    // }

    // public int dfs(int n, int index, int sum, int product){
    //     if(index > n || sum > n){
    //         return 0;
    //     }

    //     if(index == n || sum == n){
    //         return product;
    //     }

    //     int res = dfs(n, index + 1, sum + index, product * index);
    //     int next = dfs(n, index + 1, sum, product);
    //     int next2 = dfs(n, index, sum + index, product * index);

    //     return Math.max(Math.max(res, next),next2);
    // } 
}
