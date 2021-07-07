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
     *
     */
    public int twoEggDrop(int n) {
        int[][] dp = new int[n+1][2];
        for(int i = 1;i <= n;i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        for(int i = 1;i <= n;i++){
            dp[i][0] = i;
        } 
        
        for (int j = 1; j <= n; ++j) {
            for (int k = 1; k <= j; ++k) {
                dp[j][1] = Math.min(dp[j][1], Math.max(dp[k-1][0] + 1, dp[j - k][1] + 1));
            }
        }

        return dp[n][1];
    }

    /**
     * 記憶化搜索
     */
    Map<Integer, Integer> memo = new HashMap<>();
    public int twoEggDrop(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int ans = n;
        for(int i = 1;i <= n;i++){
            ans = Math.min(ans, 1 + Math.max(twoEggDrop(n - i), i - 1));
        }


        memo.put(n, ans);
        return ans;
    }


}   


