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
     *   [2,6,4,8,10,9,15]
     * s [2,4,6,8,9,10,15]
     * start = 1
     * end = 5
     */
    public int findUnsortedSubarray(int[] nums) {
        int[] snums = nums.clone();
        Arrays.sort(snums);
        int start = Integer.MAX_VALUE,end = 0;
        for(int i = 0;i < nums.length;i++){
            if(snums[i] != nums[i]){
                start = Math.min(i, start);
                end = Math.max(i, end);
            }
        }

        return end - start >= 0 ? end - start + 1: 0;  
    }

}
