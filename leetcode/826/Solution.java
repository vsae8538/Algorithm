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

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int max = 0;
        for(int i = 0;i < worker.length;i++){
            int n = 0;
            for(int j = 0;j < difficulty.length;j++){
                if(difficulty[j] <= worker[i]){
                    n = Math.max(n, profit[j]);
                }
            }
            max += n;
        }

        return max;
    }
}



