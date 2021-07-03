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

    public int longestValidParentheses(String s) {
        int res = 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i-2] : 0) + 2;
                }else if(i - dp[i-1] > 0 && s.charAt(i - dp[i - 1] - 1) == '('){
                    if(i - dp[i - 1] >= 2){
                        dp[i] = dp[i-1] + 2 + dp[i - dp[i - 1] - 2];
                    }else{
                        dp[i] = dp[i-1] + 2;
                    }
                }
            }
            res = Math.max(res, dp[i]);
        }

        return res;
    }

}   


