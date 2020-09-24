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



    Queue<Integer> queue;
    
    public MyStack()
    {
        this.queue=new LinkedList<Integer>();
    }
    
    // Push element x onto stack.
    public void push(int x) 
    {
       queue.add(x);
       for(int i=0;i<queue.size()-1;i++)
       {
           queue.add(queue.poll());
       }
    }

    // Removes the element on top of the stack.
    public void pop() 
    {
        queue.poll();
    }

    // Get the top element.
    public int top() 
    {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() 
    {
        return queue.isEmpty();
    }

    //   /** Initialize your data structure here. */
    // Queue<Integer> queue;
    // int top;
    // public MyStack() {
    //     queue = new LinkedList<>();    
    //     top = -1;
    // }
    
    // /** Push element x onto stack. */
    // public void push(int x) {
    //     queue.offer(x);
    //     top = x;
    // }

    // /** Removes the element on top of the stack and returns that element. */
    // public int pop() {
    //     int len = queue.size();
    //     while(len != 1){
    //         if(len == 2) top = queue.peek(); 
    //         queue.offer(queue.poll());
    //         len--;
    //     }
    //     int res = queue.poll();
    //     return res;
    // }
    
    // /** Get the top element. */
    // public int top() {
    //     return top;
    // }
    
    // /** Returns whether the stack is empty. */
    // public boolean empty() {
    //     return queue.isEmpty();
    // }
}



