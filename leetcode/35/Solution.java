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

    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1]) return nums.length;
        else if(target < nums[0]) return 0;

        int left = 0,right = nums.length - 1;
        int mid = 0;
        while(left <= right){
            mid = (left + right) / 2;
            if(nums[mid] < target){
                left = mid+1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                return mid;
            }
        }

        for(int i = 0;i < nums.length;i++){
            if(nums[i] > target) return i;
        }
        return -1;
    }
}



