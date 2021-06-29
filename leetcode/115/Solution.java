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

    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 1;i <= n;i++){
            dp[i][0] = 1;
        }
        for(int i = 1;i <= m;i++){
            dp[0][i] = 0;
        }
        dp[0][0] = 1;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= m;j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        // for(int i = 1;i <= n;i++){
        //     for(int j = 1;j <= m;j++){
        //        System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        return dp[n][m];
    }
 


}   


