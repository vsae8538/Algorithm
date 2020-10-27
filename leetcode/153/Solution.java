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
     * O(logn)
     * 半拆查找
     */
    public int findMin(int[] nums) {
        if (nums.length == 1) {
          return nums[0];
        }
        int left = 0, right = nums.length - 1;
        if (nums[right] > nums[0]) {
          return nums[0];
        }
        
        while (right >= left) {
          int mid = left + (right - left) / 2;

          if (nums[mid] > nums[mid + 1]) {
            return nums[mid + 1];
          }
          if (nums[mid - 1] > nums[mid]) {
            return nums[mid];
          }

          if (nums[mid] > nums[0]) {
            left = mid + 1;
          } else {
            right = mid - 1;
          }

        }
        return -1;
      }
    

    // public int findMin(int[] nums) {
    //     int min = Integer.MAX_VALUE;
    //     for(int n  : nums) min = Math.min(min, n);
    //     return min;
    // }

    // public int findMin(int[] nums) {
    //     Arrays.sort(nums);
    //     return nums[0];
    // }
}



