import java.lang.reflect.Array;
import java.math.BigInteger;
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
     * 回溯
     */
    List<String> list;
    int count = 0;
    public CombinationIterator(String characters, int combinationLength) {
        if(characters == null) return;
        list = new LinkedList<String>();
        count = 0;
        backTracking(new StringBuffer(), characters, combinationLength, -1);
    }
    
    public String next() {
        return list.get(count++);
    }
    
    public boolean hasNext() {
        if(count < list.size())
            return true;
        else
            return false;
    }

    public void backTracking(StringBuffer res, String characters, int n,int index){
        if(res.length() == n){
            if(!list.contains(res.toString()))
                list.add(res.toString());
            return;
        }

        for(int i = 0;i < characters.length();i++){
            if(i <= index) 
                continue;
            res.append(characters.charAt(i));
            backTracking(res, characters, n, i);
            res.deleteCharAt(res.length()-1);
        }
    }
}



