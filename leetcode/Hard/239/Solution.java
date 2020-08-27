import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
     * 優先權柱列
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 建立最大HeaP
        Queue<Integer> max = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                // TODO Auto-generated method stub
                return i2 - i1;
            }
        });
        int n = nums.length;
        if (n == 0) {
            return nums;
        }
        int result[] = new int[n - k + 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            //移除第一個元素
            if (max.size() >= k) {
                max.remove(nums[i - k]);
            }
            max.offer(nums[i]);
            //更新 result
            if (i >= k - 1) {
                result[index++] = max.peek();
            }
        }
        return result;
    }
    

    /**
     * 
     * 滑動窗口 優先權柱列
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 0, r = 0;
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, Collections.reverseOrder());
        Queue<Integer> queue2 = new LinkedList<>();
        while(r < nums.length){
            queue.add(nums[r]);
            queue2.add(nums[r]);
            if(r - l + 1 >= k){
                queue2.poll();
                list.add(queue.peek());
                if(queue.size() == 1) queue.poll();
                else
                    while(!queue2.contains(queue.peek())) queue.poll();
                l++;  
            }
            r++;
        }
        int[] res = list.stream().mapToInt(i->i).toArray();
        return res;
    }

}



