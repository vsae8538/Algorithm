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
    /*
    厄拉多塞筛法
    */
    public int countPrimes(int n) {
        int res = 0;
        boolean[] signs = new boolean[n];
        for(int i = 2;i < n;i++){
            signs[i] = true;
        }
        for(int i = 2;i < n;i++){
            if(signs[i]){
                res++;
                for(int j = i + i;j < n;j += i){
                    signs[j] = false;
                }
            }
        }
        return res;
    }


}



