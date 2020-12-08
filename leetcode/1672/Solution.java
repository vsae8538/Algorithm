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

    public int maximumWealth(int[][] accounts) {
        int m = accounts.length, n = accounts[0].length;
        int[] tmp = new int[m];
        int max = 0;

        int i = 0,j = 0;
        for(;j < n * m;j++){
            if(j > 0 && j % n == 0) i++;
            tmp[i] += accounts[i][j % n];
        }

        for(int sum : tmp) max = Math.max(sum, max);
        
        return max;
    }

}