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
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n+1][m+1];
        
        dp[0][0] = grid[0][0];
        for(int i = 1; i <= n;i++){
            dp[i][0] = dp[i-1][0] + grid[i][0]; 
        }
        for(int j = 1; j <= m;j++){
            dp[0][j] = dp[0][j-1] + grid[0][j]; 
        }

        for(int i = 1; i < n;i++){
            for(int j = 1;j < m;j++){
                dp[i][j] = Math.min(grid[i][j] + dp[i-1][j], grid[i][j] + dp[i][j-1]);
            }
        }


        return dp[n-1][m-1];
    }




    /*

    暴力DFS TLE
    */
    // public int minPathSum(int[][] grid) {
    //     return dfs(grid, 0, 0);
    // }

    // public int dfs(int[][] grid, int i, int j){
    //     int res = Integer.MAX_VALUE;

    //     if(j + 1 < grid[0].length){
    //         int path1 = grid[i][j] + dfs(grid, i, j+1);
    //         res = Math.min(res, path1);
    //     }
        
    //     if(i + 1 < grid.length){
    //         int path2 = grid[i][j] + dfs(grid, i+1, j);
    //         res = Math.min(res, path2);
    //     }
        
    //     return res == Integer.MAX_VALUE ? grid[i][j]: res;
    // }
}
