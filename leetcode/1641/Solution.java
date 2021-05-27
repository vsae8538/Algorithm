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

import javax.swing.tree.TreeNode;


class Solution{


    public int countVowelStrings(int n) {
        int[][] dp = new int[n+1][6];        
        
        for(int i = 1;i < 6;i++) dp[1][i] = 1;

        for(int i = 2;i <= n;i++){
            dp[i][5]=dp[i-1][1]+dp[i-1][2]+dp[i-1][3]+dp[i-1][4]+dp[i-1][5];
            dp[i][4]=dp[i-1][1]+dp[i-1][2]+dp[i-1][3]+dp[i-1][4];
            dp[i][3]=dp[i-1][1]+dp[i-1][2]+dp[i-1][3];
            dp[i][2]=dp[i-1][1]+dp[i-1][2];
            dp[i][1]=dp[i-1][1];
        }

        return dp[n][1] + dp[n][2] + dp[n][3] + dp[n][4] + dp[n][5];
    }


    public int countVowelStrings(int n) {
        int res = 0;
        int[][] dp = new int[n+1][5];
        
        for(int i = 0;i < 5;i++){
            dp[0][i] = 1; 
        }

        int sum = 5;
        for(int i = 1;i <= n;i++){
            dp[i][0] = sum;
            int num = dp[i][0];
            for(int j = 1;j < 5;j++){
                dp[i][j] = sum - dp[i-1][j-1];
                sum = dp[i][j];
                num += dp[i][j];
            }
            sum = num;
        }

        for(int i = 0;i < 5;i++){
            res += dp[n-1][i];
        }

        return res;
    }
}
