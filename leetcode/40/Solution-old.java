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

    /***
     * 回溯
     * 
     */
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); //排序剪枝,去除重複的兩數[1,2,1] => [1,1,2] 
        backtracking(candidates, 0, 0, target, new LinkedList<>());
        return res;
    }

    public void backtracking(int[] nums, int sum, int index, int target, List<Integer> list){
        if(sum > target){
            return;
        }else if(sum == target){
            res.add(new LinkedList<>(list));
        }else{
            for(int i = index;i < nums.length;i++){
                if(i > index && nums[i] == nums[i-1]) //若前後兩數相同,則跳過
                    continue;
                list.add(nums[i]);
                sum += nums[i];
                backtracking(nums, sum, i+1, target, list);
                sum -= nums[i];
                list.remove(list.size()-1);
            }
        }
    }


}



