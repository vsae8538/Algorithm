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


  
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> counts = new Stack<>();
        for (int i = 0; i < sb.length(); i++) {
            if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                counts.push(1);
            } else {
                int incremented = counts.pop() + 1;
                if (incremented == k) {
                    sb.delete(i - k + 1, i + 1);
                    i = i - k;
                } else {
                    counts.push(incremented);
                }
            }
        }
        return sb.toString();
    }
}



