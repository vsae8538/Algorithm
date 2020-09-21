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
     * 
     *       
     *     1              2 
     *    2 3 4 5 6 7 8 9  3 4 5 6 7 8 9
     *   r
     * @param n
     * @return
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
            return 1;
        boolean[] used = new boolean[10];
        return getUniques(1, Math.min(n, 10), used);
    }

    int getUniques(int index, int n, boolean[] used) {
        if (index > n)
            return 0;
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            if (used[0] && index == 2)
                continue;
            if (!used[i]) {
                used[i] = true;
                count += getUniques(index + 1, n, used) + 1;
                used[i] = false;
            }
        }
        return count;
    }

}



