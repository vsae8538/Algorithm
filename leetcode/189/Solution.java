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


    /**
     * 數組翻轉
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
    

    /**
     * TLE

     */
    public void rotate(int[] nums, int k) {
        int n = 0;
        while(n < k){
            int tmp = nums[0];
            for(int i = 1;i < nums.length;i++){
                int num = nums[i];
                nums[i] = tmp;
                tmp = num;
            } 
            nums[0] = tmp;
            n++;
        }

    }

    // public void rotate(int[] nums, int k) {
    //     int[] arr = new int[nums.length];
    //     for(int i = 0;i < nums.length;i++){
    //         arr[(i + k) % nums.length] = nums[i];
    //     }
    //     for(int i = 0;i < nums.length;i++){
    //         arr[i] = nums[i];
    //     }
    // }

}   


