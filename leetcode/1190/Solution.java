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



    /*
        暴力
     */
    // public String reverseParentheses(String s) {
    //     Stack<Integer> stack = new Stack<>();
    //     char[] chs = s.toCharArray();
    //     String res = "";
    //     for(int i = 0;i < s.length();i++){
    //         if(chs[i] == '('){
    //             stack.push(i);
    //         }else if(chs[i] == ')'){
    //             reverse(chs, stack.pop() + 1, i - 1);
    //         }
    //     }
        
    //     for(char c : chs){
    //         if (c != '(' && c != ')') {
    //             res = res + c;
    //         }
    //     }

    //     return res;
    // }

    // public void reverse(char[] chs, int start, int end){
    //     while(start < end){
    //         char tmp = chs[start];
    //         chs[start] = chs[end];
    //         chs[end] = tmp;
    //         start++;
    //         end--;
    //     }
    // }
}



