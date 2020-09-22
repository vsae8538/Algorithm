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
    int maxSize;
    public CustomStack(int maxSize) {
        if(maxSize == 0) return;
        this.maxSize = maxSize;
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        if(list.size() >= maxSize){
            return;
        }else{
            list.add(x);
        }
    }
    
    public int pop() {
        if(!list.isEmpty()){
            int x = list.get(list.size()-1);
            list.remove(list.size()-1);
            return x;
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        int len;
        if(list.size() < k)
            len = list.size(); 
        else
            len = k;
        for(int i = 0;i < len;i++){
            list.set(i, list.get(i)+val);
        }        
    }
}



