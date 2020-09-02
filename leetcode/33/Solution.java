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
     * 雙指針搜尋
     * O(logn)
     */
    public int search(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        int st = 0;
        while(left <= right){
            if(left <= right && nums[left] == target) return left;
            if(left <= right && nums[right] == target) return right;
            left++;
            right--;
        }
        return -1;
    }

}



