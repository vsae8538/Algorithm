import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
import java.util.Map.Entry;


class Solution{
    public int trap(int[] height) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i < height.length;i++){
            while(!stack.isEmpty() && height[stack.peek()] < height[i]){
                int cur = stack.peek();
                stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                int l = stack.peek();
                int r = i;
                int h = Math.min(height[l], height[r]) - height[cur];
                int w = r - l - 1;
                res += w * h;
            }
            stack.push(i);
        }

        return res;
    }
}

