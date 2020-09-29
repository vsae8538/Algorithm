import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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

class Solution {

    /**
     * 
     * 狀態定義: dp[i][j] = 到達該路徑最小和
     * 狀態移轉: dp[i][j] = min(dp[i-1][j-1]+A[i][j], dp[i-1][j]+A[i][j], dp[i-1][j+1]+A[i][j]) 
     * 初始化:
     *  dp[0][i] -> 填滿第一列所有行
     *  dp[i][j] -> 填滿後續列所有行最大值
     *    A       dp
     *  1 2 3   1 2 3
     *  4 5 6 > 5 6 8
     *  7 8 9  12 13 14
     */
    public int minFallingPathSum(int[][] A) {
        int res = Integer.MAX_VALUE;
        int m = A.length;
        int n = A[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0;i < n;i++){
            dp[0][i] = A[0][i];
        }
        for(int i = 1;i < m;i++){
            for(int j = 0;j < n;j++){
                dp[i][j] = 101;
            }
        }

        for(int i = 1;i < m;i++){
            for(int j = 0;j < n;j++){
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + A[i][j]);
                if(i-1 >= 0 && j-1 >= 0){
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1] + A[i][j]);
                }
                if(i-1 >= 0 && j+1 < n){
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j+1] + A[i][j]);
                }    
            }
        }
        //只需要找最後一列(最低階)
        for(int i = 0;i < n;i++){
            res = Math.min(res, dp[m-1][i]);
        }
        return res;
    }


}



