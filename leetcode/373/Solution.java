import java.math.BigDecimal;
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


class Solution {


    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if(nums1.length == 0 || nums2.length == 0)
            return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        k = Math.min(k , nums1.length * nums2.length);

        PriorityQueue<int[]> heap = new PriorityQueue<int[]>((a,b) -> (sum(b) - sum(a))); //ASC

        for(int n1 : nums1){
            for(int n2 : nums2){
                if(heap.size() < k){
                    heap.offer(new int[]{n1,n2});
                }else if(n1 + n2 <= heap.peek()[0] + heap.peek()[1]){
                    heap.poll();
                    heap.offer(new int[]{n1,n2});
                }
            }
        }

        while(k > 0){
            int[] arr = heap.poll();
            res.add(0, Arrays.asList(arr[0], arr[1]));//從頭部插入
            k--;
        }
        return res;
    }
  
    public int sum(int[] a){
        return a[0] + a[1];
    }


}



