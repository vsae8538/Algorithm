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

    int res = 0;
    public int subsetXORSum(int[] nums) {
        bracktracking(nums, new ArrayList<>(), 0);
        return res;
    }

    public void bracktracking(int[] nums, List<Integer> list, int index){
        res += xorOper(list); 
    
        for(int i = index;i < nums.length;i++){
            list.add(nums[i]);
            bracktracking(nums, list, i + 1);
            list.remove(list.size()-1);
        }

    }

    public int xorOper(List<Integer> list){
        if(list.size() == 0){
            return 0;
        }
        if(list.size() == 1){
            return list.get(0);
        }

        int xorSum = 0;
        for(int num : list){
            xorSum ^= num;
        }

        return xorSum;
    }


}   


