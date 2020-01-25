import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        
    }

    //提示：
    //題目的不要求是子數組，所以直接使用Map來記錄元素出現的次數，然後遍歷Map求出差值為1的元素最大值即可。
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0, res = 0;
        for(int num : nums)
            map.put(num, map.getOrDefault(num, 0)+1);
        for(int n : map.keySet()){
            if(map.containsKey(n+1)){
                sum = map.get(n) + map.get(n + 1);
                res = Math.max(res, sum);
            }
        }
        return res;
    }

}