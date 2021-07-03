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
     * 貪心 O(n)
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0; 
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]); 
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
    

    /**
     * dp、貪心
     */
    // public int jump(int[] nums) {
    //     if(nums.length == 1){
    //         return 0;
    //     }
        
    //     int len = nums.length;
    //     int[] dp = new int[len];

    //     Arrays.fill(dp, Integer.MAX_VALUE);
    //     dp[0] = 0;
    //     for(int i = 0;i < len;i++){
    //         int step = nums[i];
    //         for(int j = 1;j <= step;j++){
    //             if(i + j >= len) 
    //                 break;
    //             dp[i+j] = Math.min(dp[i]+1, dp[i+j]);
    //         }
    //     }

    //     return dp[len-1];
    // }

}   


