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

    /*滑動窗口
    */
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0,res = 0,sum = 0;
        Set<Character> set = new HashSet<>();
        while(r < s.length()){
            char c = s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            res = Math.max(res, r - l + 1);
            set.add(c);
            r++;
        }
        return res;
    }

}



