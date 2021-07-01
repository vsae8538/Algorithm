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
     * @param s
     * @return
     */
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len+1][len+1];

        for(int i = 0;i < len;i++){
            dp[i][i] = 1;
        }

        for(int i = len - 1;i >= 0;i--){
            for(int j = i + 1;j < len;j++){
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1] + 2;
                }else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }

        return dp[0][len - 1];
    }

    /**
     * 記憶化搜索
     */
    int[][] memo;
    public int longestPalindromeSubseq(String s) {
        memo = new int[s.length()][s.length()]; 
        return dfs(s, 0, s.length()-1);
    }

    public int dfs(String s, int start, int end){
        if(memo[start][end] != 0) return memo[start][end];
        if(start == end){
            return 1;
        }
        if(start > end){
            return 0;
        }
    
        int res = 0;
        if(s.charAt(start) == s.charAt(end)){
            res = dfs(s, start+1, end-1) + 2;
        }else{
            res = Math.max(dfs(s, start+1,end), dfs(s, start,end-1));
        }

        memo[start][end] = res;
        return memo[start][end];
    }

    /**
     * DFS TLE
     * @param s
     * @return
     */
    public int longestPalindromeSubseq(String s) {
        return dfs(s, 0, s.length()-1);
    }

    public int dfs(String s, int start, int end){
        if(start == end){
            return 1;
        }
        if(start > end){
            return 0;
        }
        int res = 0;
        if(s.charAt(start) == s.charAt(end)){
            res = dfs(s, start+1, end-1) + 2;
        }else{
            res = Math.max(dfs(s, start+1,end), dfs(s, start,end-1));
        }

        return res;
    }


}   


