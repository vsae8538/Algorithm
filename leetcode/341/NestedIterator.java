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


 // This is the interface that allows for creating nested lists.
  // You should not implement it, or speculate about its implementation
public interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
      public boolean isInteger();
 
     // @return the single integer that this NestedInteger holds, if it holds a single integer
     // Return null if this NestedInteger holds a nested list
      public Integer getInteger();
 
      // @return the nested list that this NestedInteger holds, if it holds a nested list
      // Return empty list if this NestedInteger holds a single integer
      public List<NestedInteger> getList();
}
 
public class NestedIterator implements Iterator<Integer> {


    List<Integer> list;
    int pt;

    public NestedIterator(List<NestedInteger> nestedList) {
        list = new ArrayList<>();
        pt = 0;
        dfs(nestedList, 0);
    }

    public void dfs(List<NestedInteger> nestedList, int index){
        if(index >= nestedList.size()) 
            return;
        
        NestedInteger n = nestedList.get(index);
        
        if(n.isInteger()){
            list.add(n.getInteger());
        }else{
            dfs(n.getList(), 0);   
        }

        dfs(nestedList, index+1);
    }

    @Override
    public Integer next() {
        return list.get(pt++);
    }

    @Override
    public boolean hasNext() {
        return pt < list.size();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */