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
    /**
     * 單調棧
     */
    public int largestRectangleArea(int[] heights) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        
        int[] new_heights = new int[heights.length + 2];
        new_heights[0] = 0;
        new_heights[new_heights.length - 1] = 0;
        for(int i = 1;i <= heights.length;i++){
            new_heights[i] = heights[i-1];
        }

        for(int i = 0;i < new_heights.length;i++){
            while(!stack.isEmpty() && new_heights[stack.peek()] > new_heights[i]){
                int cur = stack.pop();
                int height = new_heights[cur];
                
                int rightIndex = i;
                int leftIndex = stack.peek();
                int width = rightIndex - leftIndex - 1; // -1 為當前cur(棧頂彈出)本身

                res = Math.max(res, width * height);
            }
            stack.push(i);
        }



        return res;
    }

}

