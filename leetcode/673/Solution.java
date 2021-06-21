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

    public int findNumberOfLIS(int[] nums) {
        int N = nums.length;
        if (N <= 1) return N;
        int[] dp = new int[N]; 
        int[] counts = new int[N];
        Arrays.fill(counts, 1);

        for (int j = 0; j < N; ++j) {
            for (int i = 0; i < j; ++i) 
            if (nums[i] < nums[j]) { 
                if (dp[i] >= dp[j]) { //表示第一次找到這個組合,dp[i] >= dp[j]
                    dp[j] = dp[i] + 1;
                    counts[j] = counts[i];
                } else if (dp[i] + 1 == dp[j]) { //此時第二次找到這個組合, dp[i] + 1 == dp[j]
                    counts[j] += counts[i];
                }
            }
        }

        int longest = 0, ans = 0;
        for (int length: dp) {
            longest = Math.max(longest, length);
        }
        for (int i = 0; i < N; ++i) {
            if (dp[i] == longest) {
                ans += counts[i];
            }
        }
        return ans;
    }

}
