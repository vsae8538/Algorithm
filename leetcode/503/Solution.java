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
     * 單調棧(堆疊)
     * 
     */
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * nums.length - 1; i >= 0; --i) {
            //出棧以後表示出棧的元素已找到下一個最大數
            while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]) {
                stack.pop();
            }
            res[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
            stack.push(i % nums.length);
        }
        return res;
    }

    /**
     * 無腦法
     */
    // public int[] nextGreaterElements(int[] nums) {
    //     int[] res = new int[nums.length];
    //     int i = 0,j = 0;
    //     while(i < res.length){
    //         int cnt = 0;
    //         int isExists = 0;
    //         j = i % nums.length;
    //         while(cnt < nums.length){
    //             if(nums[j] > nums[i]){
    //                 res[i] = nums[j];
    //                 isExists = 1;
    //                 break;
    //             }
    //             j = (j + 1) % nums.length;
    //             cnt++;
    //         }
    //         if(isExists == 0)
    //             res[i] = -1;
            
    //         i++;
    //     }
    //     return res;
    // }
}



