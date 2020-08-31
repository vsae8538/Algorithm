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

    public boolean checkRecord(String s) {
        int[] arr = new int[1];
        for(char c : s.toCharArray())
            if(c == 'A') arr[0]++;
        if(arr[0] > 1) return false;
        if(s.indexOf("LLL") != -1) return false;
        return true;
    }

}



