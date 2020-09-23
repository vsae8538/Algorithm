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



    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0, j = 0;
        for (int x : pushed) {
            pushed[i++] = x;
            while (i > 0 && pushed[i - 1] == popped[j]) {
                --i; ++j;
            }
        }
        return i == 0;
    }

    /**
     * 

     */
    // public boolean validateStackSequences(int[] pushed, int[] popped) {
    //     Stack<Integer> stack = new Stack<>();
    //     int i = 0;
    //     for (int x : pushed) {
    //         stack.push(x);
    //         while (!stack.empty() && stack.peek() == popped[i]) {
    //             stack.pop();
    //             i++;
    //         }
    //     }
    //     return stack.empty();
    // }
}



