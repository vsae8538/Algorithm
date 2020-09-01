import java.lang.reflect.Array;
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
        -4 -1 1 2

     */
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        if(nums.length == 3) return res;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 2;i++){
            int n = nums[i];
            int left = i + 1,right = nums.length - 1;
            while(left < right){
                int sum = nums[left] + nums[right] + n;
                if(Math.abs(sum - target) < Math.abs(res - target)){
                    res = sum;
                }
                if(sum >= target) right--;
                else if(sum < target) left++;
            }
        }
        return res;
    }
}



