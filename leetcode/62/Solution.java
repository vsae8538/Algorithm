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
     * 
     */
    public int uniquePaths(int m, int n) {
        return dp(m,n);
    }


    public int dp(int m, int n){

        int[][] dp = new int[m+1][n+1];

        for(int i = 1;i <= m;i++){
            dp[i][1] = 1;
        }
        for(int i = 1;i <= n;i++){
            dp[1][i] = 1;
        }


        for(int i = 2;i <= m;i++){
            for(int j = 2;j <= n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        for(int i = 1;i <= m;i++){
            for(int j = 1;j <= n;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[m][n];
    }

    /**
     * 
     * 記憶化搜索 至頂向下 
     */
    // public int uniquePaths(int m, int n) {
    //     int[][] dp = new int[m+1][n+1];
    //     for(int i = 1;i <= m;i++){
    //         for(int j = 1;j <= n;j++){
    //             dp[i][j] = -1;
    //         }
    //     }


    //     return walk(m, n, dp);
    // }

    // public int walk(int r, int c, int dp[][]){
    //     if(r <= 0 || c <= 0){
    //         return 0;
    //     }

    //     if(dp[r][c] != -1){
    //         return dp[r][c];
    //     }

    //     if(r == 1 && c == 1){
    //         return 1;
    //     }

    //      dp[r][c] = walk(r - 1, c, dp) + walk(r, c - 1, dp);
    
    //     return dp[r][c];
    // }


    /**
     * 暴力遞歸 TLE
     */
    // public int uniquePaths(int m, int n) {
    //     return walk(m, n, 1, 1);
    // }

    // public int walk(int m, int n, int r, int c){
    //     if(r > m || c > n){
    //         return 0;
    //     }

    //     if(r == m && c == n){
    //         return 1;
    //     }

    //     return walk(m, n, r + 1, c) + walk(m, n, r, c + 1);
    // }
}

    

