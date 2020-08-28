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
    public int maxScore(String s) {
        int l = 0, r = 1;
        int rn = 0,ln = s.charAt(0) == '0' ? 1:0;
        int max = 0;
        for(int i = r;i<s.length();i++)
            if(s.charAt(i) == '1') rn++;
    
        while(r < s.length()){
            max = Math.max(max, rn+ln);
            if(s.charAt(r) == '0') ln++;
            else rn--;
            r++;
        }
        return max;
    }

    
}



