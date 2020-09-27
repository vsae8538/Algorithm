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
import java.util.TreeMap;
import java.util.TreeSet;

class Solution {


    /**
     * [1, 0, -1, 0, -2, 2]
     * 
     *         1                  0   -1  0   -2  2
     *   0  -1  0   -2  2
     *  -1  0   -2  2
     */

    /**
     * DFS回溯可過

     * 
     */
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        dfs(nums, 0, 0, target, new LinkedList<>());
        return res;
    }

    public void dfs(int[] nums, int start, int sum, int target, List<Integer> list){
        if(sum == target && list.size() == 4){
            res.add(new LinkedList<>(list));
            return;
        }
        else if(list.size() == 4){
            return;
        }
        for(int i = start;i < nums.length;i++){
            /*    不剪枝會TLE   */
            if(nums[i] +  nums[nums.length - 1] * (3 - list.size()) + sum < target) continue;
            if(nums[i] * (4 - list.size()) + sum > target) return;      
            /*               */
            sum += nums[i];
            list.add(nums[i]);
            dfs(nums, i+1, sum, target, list);
            list.remove(list.size()-1);
            sum -= nums[i];
            // 跳過重複
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }

    }

}



