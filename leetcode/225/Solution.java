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



      /** Initialize your data structure here. */
    Queue<Integer> queue;
    int top;
    public MyStack() {
        queue = new LinkedList<>();    
        top = -1;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
        top = x;
    }
    /*** 
     * 
     *  ["MyStack","push","push","push","top","pop","top","pop","top","empty","pop","empty"]
            [[],[1],[2],[3],[],[],[],[],[],[],[],[]]
            1 2 3
            (3) 1 2
        
     */
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int len = queue.size();
        while(len != 1){
            if(len == 2) top = queue.peek(); 
            queue.offer(queue.poll());
            len--;
        }
        int res = queue.poll();
        return res;
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}



