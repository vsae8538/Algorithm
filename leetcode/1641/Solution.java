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

class Solution{

    /**
     * 
     * DP
     */
    int res = 0;
    char[] vowel = {'a','e','i','o','u'};
    public int countVowelStrings(int n) {
        return dpWay(n);
    }

    public int dpWay(int N){
        int[][] dp = new int[6][N+1];
        
        for(int i = 1;i <= 5;i++){
            dp[i][1] = 1;
        }

        for(int i = 2;i <= N;i++){
            int sum = 0;
            for(int j = 1;j <= 5;j++){
                sum += dp[j][i-1];
            }

            dp[1][i] = sum; 
            for(int j = 2;j <= 5;j++){
                dp[j][i] = dp[j-1][i] - dp[j-1][i-1];
            }

        }

        // for(int i = 1;i <= 5;i++){
        //     for(int j = 1;j <= N;j++){
        //         System.out.print(dp[i][j]);
        //     }
        //     System.out.println();
        // }

        int res = 0;
        for(int i = 0;i <= 5;i++){
            res += dp[i][N];
        }

        return res;
    }



    /*
    
        回溯 暴力遞歸
    */
    // int res = 0;
    // char[] vowel = {'a','e','i','o','u'};
    // public int countVowelStrings(int n) {
    //     backtracking(n, 0, 1, new StringBuilder());
    //     return res;
    // }

    // public void backtracking(int n, int index, int level, StringBuilder sb){
    //     //System.out.println(sb.toString());
    //     if(level > n){
    //         res++;
    //         return;
    //     }

    //     for(int i = index;i < vowel.length;i++){
    //         sb.append(vowel[i]);
    //         backtracking(n, i, level + 1, sb);
    //         sb.deleteCharAt(sb.length() - 1);
    //     }
    // }

}

    

