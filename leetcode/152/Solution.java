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

    public int maxProduct(int[] nums) {
        int length = nums.length;
        int max = nums[0],min = nums[0];
        int res = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(nums[i] < 0){
                int tmp = max;
                max = min;
                min = tmp;
            }
            max = Math.max(max * nums[i], nums[i]);
            min = Math.min(min * nums[i], nums[i]);
            res = Math.max(max, res);
        }

        return res;
    }

    /**
     * DFS TLE
     */
    int max = Integer.MIN_VALUE;
    public int maxProduct(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0;i < nums.length;i++){
            dfs(nums, i + 1, nums[i]);
        }
        return max;
    }

    public void dfs(int[] nums, int index, int sum){
        max = Math.max(max, sum);
        if(index == nums.length){
            return;
        }
        
        dfs(nums, index + 1, sum * nums[index]);
    }


}   


