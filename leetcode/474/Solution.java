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
     * dp 
     * 轉化01背包
     * @param strs
     * @param m
     * @param n
     * @return
     */
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (String str : strs) { 
            int oneNum = 0, zeroNum = 0;
            for (char c : str.toCharArray()) {
                if (c == '0') zeroNum++;
                else oneNum++;
            }
            for (int i = m; i >= zeroNum; i--) {
                for (int j = n; j >= oneNum; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);
                }
            }
        }

        return dp[m][n];
    }

    /**
     * DFS TLE
     */
    // int res = 0;
    // public int findMaxForm(String[] strs, int m, int n) {
    //     dfs(strs, m, n, 0, 0);
    //     return res;
    // }

    // public void dfs(String[] strs, int m, int n, int count, int index){
    //     if(m < 0 || n < 0){
    //         return;
    //     }

    //     res = Math.max(res, count);

    //     if(index < strs.length){
    //         String str = strs[index];
    //         int[] arr = getOneAndZero(str);
    //         dfs(strs, m - arr[0], n - arr[1], count + 1, index + 1);
    //         dfs(strs, m, n, count, index + 1);
    //     }
    // }

    // public int[] getOneAndZero(String s){
    //     int[] arr = new int[2];
    //     for(char c : s.toCharArray()){
    //         if(c == '0') arr[0]++;
    //         else if(c == '1') arr[1]++;
    //     }
        
    //     return arr;
    // }

}
