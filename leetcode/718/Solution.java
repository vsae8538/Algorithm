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


    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n+1][m+1];
        int max = 0;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= m;j++){
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                max = Math.max(max, dp[i][j]);
            }
        }

        // for(int i = 1;i <= n;i++){
        //     for(int j = 1;j <= m;j++){
        //         System.out.print(dp[i][j] + " ");       
        //     }
        //     System.out.println();
        // }

        return max;
    }
 
}   


