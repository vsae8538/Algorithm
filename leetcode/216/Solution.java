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
import java.util.TreeSet;

class Solution {

    /**
     * dp
     */
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[1], nums[0]);
        }

        int[] dp = new int[nums.length];
        int[] dp2 = new int[nums.length];        
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2;i < nums.length - 1;i++){
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }

        dp2[1] = nums[1];
        dp2[2] = nums[2];
        for(int i = 3;i < nums.length;i++){
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }

        return Math.max(dp2[nums.length-1], dp[nums.length-1]);
    }

    /***
     * 回溯
     * 
     */
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k, 0, n, 1, new LinkedList<>());
        return res;
    }

    public void backtracking(int k, int sum, int n, int idx, List<Integer> list){
        if(list.size() == k || sum >= n){
            if(sum == n && k == list.size()) res.add(new LinkedList<>(list));
        }else{
            for(int i = idx;i < 10;i++){
                sum += i;
                list.add(i);
                backtracking(k, sum, n, i+1, list);
                list.remove(list.size()-1);
                sum -= i;
            }
        }
    }


}



