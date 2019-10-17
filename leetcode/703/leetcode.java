import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        System.out.println('Z' - 'A');
    }
    //使用優先權佇列實現最小堆,優先權佇列自排序
    PriorityQueue<Integer> minHeap;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue(k);
        for(int n :nums) add(n);
    }
    
    public int add(int val) {
        if(minHeap.size() < k){
            minHeap.offer(val);
        }else if(minHeap.peek() < val){ //取出最小再置入
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
    /* Time Limit Exceeded
    int k;
    List<Integer> list;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        list = new ArrayList<>();
        for(int n : nums) list.add(n);
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        Collections.reverse(list);
        return list.get(k-1);
    }
    */
}
