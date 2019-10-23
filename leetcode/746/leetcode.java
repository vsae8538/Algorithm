import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class leetcode {
    public static void main(String[] args) {    

    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        for(int i = 0;i < cost.length;i++){
            if(i < 2){
                dp[i] = cost[i];
            }else{
                dp[i] = Math.min(dp[i-1] + cost[i],dp[i-2]  + cost[i]);
            }
        }
        return Math.min(dp[dp.length-1], dp[dp.length-2]);//到達最終的台階有兩種方式 一步 或者 兩步
    }
}

