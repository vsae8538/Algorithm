import java.lang.reflect.Array;
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


    public int minNumberOfFrogs(String croakOfFrogs) {
        int cnt[] = new int[5];
        int frogs = 0, max_frogs = 0;
        for (int i = 0; i < croakOfFrogs.length(); ++i) {
            char ch = croakOfFrogs.charAt(i);
            int n = "croak".indexOf(ch);
            ++cnt[n];
            if (n == 0)
                max_frogs = Math.max(max_frogs, ++frogs);
            else if (--cnt[n - 1] < 0)
                return -1;
            else if (n == 4)
                --frogs;
        }
        return frogs == 0 ? max_frogs : -1;   
    }
}



