import java.lang.reflect.Array;
import java.math.BigInteger;
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
     * 單調棧
     * Monotonous stack
     */
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];
        for(int i = 0;i < T.length;i++){
            while(!stack.isEmpty() && T[stack.peek()] < T[i]){
                int n = stack.pop();
                res[n] = i - n;
            }
            stack.push(i);
        }
        return res;
    }

    
}



