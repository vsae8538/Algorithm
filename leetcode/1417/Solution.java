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
    public String reformat(String s) {
        if (s.length() <= 1)
		    return s;
        Queue<Character> q = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z') q.offer(c);
            else if(c >= '0' && c <= '9') q2.offer(c);
        }

        if(q.size() == 0 && q2.size() > 0) return "";
        else if(q2.size() == 0 && q.size() > 0) return "";

        String res = "";
        while(!q.isEmpty() || !q2.isEmpty()){
            if(q.size() > q2.size()){
                if(!q.isEmpty()) res += q.poll();
                if(!q2.isEmpty()) res += q2.poll();
            }else{
                if(!q2.isEmpty()) res += q2.poll();
                if(!q.isEmpty()) res += q.poll();
            }
        }
        return res;
    }
}



