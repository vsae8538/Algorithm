import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import java.util.TreeSet;


class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i : nums) sum += i;
        int l = nums.length -1, r = nums.length -1;
        List<Integer> res = new ArrayList<>();
        int max = 0;
        int s = 0;
        while(l >= 0){
            s += nums[l];
            if(s > max && s > (sum - s)){
                while(r >= l){
                    res.add(nums[r]);
                    r--;
                }
                max = s;
                break;
            }
            l--;
        }
        return res;
    }

}



