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


    public boolean isValid(String s) {
        if(s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '[' || c == '{' || c == '(')
                stack.push(c);
            if((c == ']' || c == '}' || c == ')') && stack.isEmpty()) return false;
            if(c == ']'){
                if(stack.peek() != '[') return false;
                else stack.pop();
            }else if(c == '}'){
                if(stack.peek() != '{') return false;
                else stack.pop(); 
            }else if(c == ')'){
                if(stack.peek() != '(') return false;
                else stack.pop(); 
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }



}



