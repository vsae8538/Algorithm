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

    public int lastStoneWeightII(int[] stones) {
        int[] dp = new int[15001];
        int sum = 0;
        for(int stone : stones) sum += stone;
        int target = sum / 2;

        for(int i = 0;i < stones.length;i++){
            for(int j = target;j >= stones[i];j++){
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        
        //一堆石頭的最大重量是dp[target], 剩餘的則是sum - dp[target]
        //兩堆石頭相撞,即是答案
        return (sum - dp[target]) - dp[target];
    }

 
}
