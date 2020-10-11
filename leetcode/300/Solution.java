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

  public int lengthOfLIS(int[] nums) {
    int[] dp = new int[nums.length];
    Arrays.fill(dp, 1);
    for(int i = 0;i < nums.length;i++){
      for(int j = 0;j < i;j++){
        if(nums[i] > nums[j]){
          dp[i] = Math.max(dp[i], dp[j]+1);
        }
      }
    }
    
    int res = 0;
    for(int n : dp){
      //System.out.print(n + " ");
      res = Math.max(n, res);
    }
    return res;
  }

}



