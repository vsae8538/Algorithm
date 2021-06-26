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
     * dp;
     */
    public int fib(int N) {
        
        int[] dp = new int[31];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i <= N;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[N];
    }

    /**
     * dp
     * 空間優化
     */
    public int fib(int n) {
        if(n == 0) return 0;
        int n1 = 0, n2 = 1;
        for(int i = 2;i <= n;i++){
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }

        return n2;
    }


}



