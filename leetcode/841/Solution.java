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

import javax.swing.tree.TreeNode;

class Solution{

    Set<Integer> visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new HashSet();
        dfs(rooms, 0, rooms.size());
        return visited.size() == rooms.size();
    }

    public void dfs(List<List<Integer>> rooms, int start, int end){
        if(start >= end) 
            return;
    
        if(visited.contains(start))
            return;
        
        visited.add(start);
        List<Integer> list = rooms.get(start);
        for(int j = 0;j < list.size();j++){
            if(!visited.contains(list.get(j))){
                dfs(rooms, list.get(j), end);
            }    
        }

    } 

}
