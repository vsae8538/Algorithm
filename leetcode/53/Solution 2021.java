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
     * 前綴和 2021
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(nums[i] > nums[i]+prefix[i-1]){
                prefix[i] = nums[i];
            }else{
                prefix[i] = nums[i]+prefix[i-1];
            }
        }

        int res = Integer.MIN_VALUE;
        for(int i = 0;i < prefix.length;i++){
            res = Math.max(prefix[i], res);
        }

        return res;
    }

}