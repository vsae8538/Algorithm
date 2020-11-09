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

    /**
     * 
     * 20201109
     * 
     */
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        backtracking(nums, new LinkedList<>(), new boolean[nums.length]);
        return res;
    }


    public void backtracking(int[] nums, List<Integer> list, boolean[] visited){
        if(list.size() == nums.length){
            //if(!res.contains(list))
                res.add(new LinkedList<>(list));
            return;
        }

        for(int i = 0;i < nums.length;i++){
            if(visited[i] == true) continue;
            list.add(nums[i]);
            visited[i] = true;
            backtracking(nums, list, visited);
            list.remove(list.size()-1);
            visited[i] = false;
            while(i < nums.length - 1 && nums[i] == nums[i+1]){
                i++;
            }
        }

    }

}



