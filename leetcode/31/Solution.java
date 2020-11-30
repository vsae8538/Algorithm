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

class Solution{
  
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i] > nums[i+1]){
            i--;
        }
        if(i >= 0){
            int j = nums.length - 1;
            while(j >= 0 && nums[i] > nums[j]){
                j--;
            }
            swap(nums, i, j);
        }

        int right = nums.length - 1;
        int left = i+1;
        while(left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public void swap(int[] nums, int i, int j){
        int tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
    }

}