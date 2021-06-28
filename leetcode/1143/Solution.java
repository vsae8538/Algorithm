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
     * dp 2
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= m;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        // for(int i = 1;i <= n;i++){
        //     for(int j = 1;j <= m;j++){
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        return dp[n][m];
    }


    /**
     * dp
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1]; //添加一行列用於邊界填值
        int n = text1.length();
        int m = text2.length();
        for(int i = n - 1; i >= 0;i--){
            for(int j = m - 1;j >= 0;j--){
                if(text1.charAt(i) == text2.charAt(j)){
                    dp[i][j] = dp[i][j] + 1 + dp[i+1][j+1];
                }
                dp[i][j] = Math.max(dp[i][j],Math.max(dp[i+1][j], dp[i][j+1]));
            }
        }

        // for(int i = 0; i < n;i++){
        //     for(int j = 0; j < m;j++){
        //     System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        return dp[0][0];
    }


    /**
     * 記憶化搜索
     */
    // int[][] memo;
    // public int longestCommonSubsequence(String text1, String text2) {
    //     memo = new int[text1.length()][text2.length()];
    //     for(int i = 0;i < memo.length;i++){
    //         Arrays.fill(memo[i], 0);
    //     }

    //     return dfs(text1, text2, 0, 0);
    // }

    // public int dfs(String text1, String text2, int i, int j){
    //     if(i >= text1.length() || j >= text2.length()){
    //         return 0;
    //     }

    //     if(memo[i][j] != 0){
    //         return memo[i][j];
    //     }

    //     int res = 0;
    //     if(text1.charAt(i) == text2.charAt(j)){
    //         memo[i][j]++;
    //         memo[i][j] += dfs(text1, text2, i + 1, j + 1);
    //         res = Math.max(res , memo[i][j]);
    //     }
        
    //     if(i+1 < text1.length()){
    //         memo[i+1][j] = dfs(text1, text2, i+1, j);
    //         res = Math.max(res , memo[i+1][j]);
    //     }
    //     if(j+1 < text2.length()){
    //         memo[i][j+1] = dfs(text1, text2, i, j+1);
    //         res = Math.max(res , memo[i][j+1]);
    //     }
        
    //     return res;
    // }



    /**
     * DFS暴力遞歸 (TLE)
     */
    // public int longestCommonSubsequence(String text1, String text2) {
    //     return dfs(text1, text2, 0, 0);
    // }

    // public int dfs(String text1, String text2, int i, int j){
    //     if(i == text1.length() || j == text2.length()){
    //         return 0;
    //     }

    //     int res = 0;
    //     if(text1.charAt(i) == text2.charAt(j)){
    //         res++;
    //     }

    //     res += dfs(text1, text2, i + 1, j + 1);
    //     int next = dfs(text1, text2, i+1, j);
    //     int next2 = dfs(text1, text2, i, j+1);

    //     return Math.max(Math.max(res, next), next2);
    // }
}
