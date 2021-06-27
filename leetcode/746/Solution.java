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
    public int minCostClimbingStairs(int[] cost) {
        return dpWay(cost, 0);
    }

    public int dpWay(int[] costs,int start){
        int[] dp = new int[costs.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[start] = costs[0];
        dp[start+1] = costs[1];
        for(int i = start;i < costs.length - 1;i++){
            dp[i + 1] = Math.min(dp[i + 1], dp[i] + costs[i + 1]);
            if(i + 2 < costs.length){
                dp[i + 2] = Math.min(dp[i + 2], dp[i] + costs[i + 2]);
            }
        }

        return Math.min(dp[costs.length - 1], dp[costs.length - 2]);
    }



    
    /***
     * DFS TLE 
     * */
    // public int minCostClimbingStairs(int[] cost) {
    //     return Math.min(dfs(cost, 0, 0),dfs(cost,1,0));
    // }

    // public int dfs(int[] costs, int index, int cost){
    //     if(index >= costs.length){
    //         return cost;
    //     }

    //     int oneStep = dfs(costs, index + 1, cost + costs[index]);
    //     int twoStep = dfs(costs, index + 2, cost + costs[index]);

    //     return Math.min(oneStep, twoStep);
    // }
 
}


