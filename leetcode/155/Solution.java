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


    List<Integer> list;
    int min;
    public MinStack() {
        list = new LinkedList<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        min = Math.min(x, min);
        list.add(x);
    }
    
    public void pop() {
        int element = list.remove(list.size()-1);
        if(min == element){
            min = Integer.MAX_VALUE;
            for(int n : list) min = Math.min(n, min);
        }
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return min;
    }
}



