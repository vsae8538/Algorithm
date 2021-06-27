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


    public int maxProfit(int k, int[] prices) {
        if(k == 0 || prices.length == 0 || prices == null) return 0;

        int len = prices.length;
        int[][] dp = new int[len][2 * k + 1];
        
        for(int i = 1;i < 2 * k;i+=2){
            //dp[0][i-1] = 0; //不持有股票
            dp[0][i] = -prices[0]; //奇數為持有股票
        }

        for(int i = 1;i < prices.length;i++){
            for(int j = 0;j < 2 * k - 1;j+=2){
                dp[i][j+1] = Math.max(dp[i-1][j+1], dp[i-1][j] - prices[i]);
                dp[i][j+2] = Math.max(dp[i-1][j+2], dp[i-1][j+1] + prices[i]);
            }
        }

        // for(int i = 0;i < prices.length;i++){
        //     for(int j = 0;j < 2 * k + 1;j++){
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        

        return dp[prices.length-1][2 * k];
    }

 
}


