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

    public int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[46];
        for(int i = lowLimit;i <= highLimit;i++){
            int sum = 0;
            int n = i;
            while(n > 0){
                sum += n % 10;
                n /= 10;
            }
            arr[sum]++;
        }

        Arrays.sort(arr);

        return arr[45];
    }
}
