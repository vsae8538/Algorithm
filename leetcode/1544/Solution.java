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
    
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        int i = 1;
        while(i < s.length()){
            Character c = s.charAt(i);
            if(!stack.isEmpty() && c >= 'A' && c <= 'Z' 
            && stack.peek() == c.toLowerCase(c)){
                stack.pop();
            }
            else if(!stack.isEmpty() && c >= 'a' && c <= 'z' 
            && stack.peek() == c.toUpperCase(c)){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
            i++;
        } 
        StringBuffer res = new StringBuffer();
        while(!stack.isEmpty()) res.append(stack.pop());
        if(res.length() == 0) return "";
        return res.reverse().toString();
    }

}



