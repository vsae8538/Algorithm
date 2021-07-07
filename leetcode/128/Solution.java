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

    /**
     * O(n)
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
    
        int maxLen = 1;

        for(int num : nums){
            if(!set.contains(num - 1)){
                int cur = num;
                int len = 1;

                while(set.contains(cur+1)){
                    cur += 1;
                    len += 1;
                }
                maxLen = Math.max(len, maxLen);
            }
        }

        return maxLen;
    }
    
    /**
     * O(nlogn)
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        Arrays.sort(nums);
        int len = 1;
        int cnt = 1;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                cnt++;
            }else if(nums[i] == nums[i-1]){
                
            }else{
                cnt = 1;
            }
            len = Math.max(cnt, len);
        }

        return len;
    }

}   


