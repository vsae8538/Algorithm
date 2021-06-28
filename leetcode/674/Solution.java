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

    /*
    空間優化
    */
    public int findLengthOfLCIS(int[] nums) {
        int cnt = 1;
        int max = 1;
        for(int i = 1;i < nums.length;i++){
            cnt = nums[i-1] < nums[i] ? cnt + 1 : 1;
            max = Math.max(cnt, max);
        }
        
        return max;
    }

    /**
     * dp
     */
    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;
        for(int i = 1;i < nums.length;i++){
            dp[i] = nums[i-1] < nums[i] ? dp[i-1] + 1 : 1;
            max = Math.max(dp[i], max);
        }
        
        return max;
    }
 
}   


