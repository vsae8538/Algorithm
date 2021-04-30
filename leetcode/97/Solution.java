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
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length();

        if (s3.length() != m + n) return false;

        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;

        for(int i = 1;i <= m && s1.charAt(i-1) == s3.charAt(i-1);i++) dp[i][0] = true;
        for(int j = 1;j <= n && s2.charAt(j-1) == s3.charAt(j-1);j++) dp[0][j] = true;

        for(int i = 1;i <= m;i++){
            for(int j = 1;j <= n;j++){
                dp[i][j] = (dp[i-1][j] && s3.charAt(i+j-1) == s1.charAt(i-1)) ||
                (dp[i][j-1] && s3.charAt(i+j-1) == s2.charAt(j-1));
            }
        }

        return dp[m][n];
    }

}
