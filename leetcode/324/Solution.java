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
     * 先排序後反穿插
     * @param nums
     */
    public void wiggleSort(int[] nums) {
        int[] help = nums.clone();
        Arrays.sort(help);
        int N = nums.length;
        for(int i = 1;i < nums.length;i+=2){
            nums[i] = help[--N];
        }
        for(int i = 0;i < nums.length;i+=2){
            nums[i] = help[--N];
        }
    }

}
