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
import java.util.TreeMap;
import java.util.TreeSet;


class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int i = 0;
        //倒序掃描,由於升序排序
        int len = citations.length - 1;
        while (i < citations.length && citations[len - i] > i) {
            i++;
        }
        return i;
    }

}



