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

    public int countLargestGroup(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int res = 0;

        for(int i = 1;i <= n;i++){
            int sum = getDigitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            max = Math.max(max, map.get(sum));
        }

        for(int num : map.values()){
            if(num == max) res++;    
        }

        return res;
    }

    public int getDigitSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit; 
            n /= 10;
        }
        return sum;
    }

}
