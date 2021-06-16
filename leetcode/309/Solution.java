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
import java.util.Scanner;

class Solution{

    /**
     * dp
     * 
     * 0 不持股且當天沒賣出(手上沒股)
     * 1 持股(持股且不賣)
     * 2 不持股且當天賣出(同等於持股且當天賣出,即今天賣了)
     * @return
     */
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n<=1) return 0;

        int [][] dp=new int[n][3];
        dp[0][0]=0;//不買第一天的股
        dp[0][1]=-1*prices[0];//買了第一天的股
        dp[0][2]=0;//等同於買了第一天股,且第一天就賣出

        for(int i = 1;i < n;i++){
          //若不持股且當天沒賣出,只有兩種可能
          //1.昨天就沒持股且未賣出dp[i-1][0]
          //2.昨天有持股且昨天賣出dp[i-1][2]
          dp[i][0]=Math.max(dp[i-1][0],dp[i-1][2]);
          //持股，只有兩種可能
          //1.昨天就持股,繼承昨天dp[i-1][1]
          //2.冷凍期,即昨天剛賣,因此用昨天不持股的狀態(因為昨天不持股,可能於昨天賣) - 今天的金額(冷凍期,因此昨天賣的扣除今天的金額) 
          dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
          //不持股且當天就賣出,因此是昨天持股+今天賣出的金額
          dp[i][2]=dp[i-1][1]+prices[i];

        }

        //最終結果必然是不持股的兩種狀態，因此比較最後一天不持股的兩種狀態
        return Math.max(dp[n-1][0],dp[n-1][2]);
    }
}
