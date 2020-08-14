import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {


    public static void main(String[] args) {    
        
    }
    /*
    卡特蘭數
    G(n)=G(0)∗G(n−1)+G(1)∗(n−2)+...+G(n−1)∗G(0)
    */
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i < n+1;i++){
            for(int j = 1;j < i + 1;j++){
                dp[i] += dp[j-1] * dp[i-j]; // G(0) * G(n-1)  
            }
        }
        return dp[n];
    }

    
}

