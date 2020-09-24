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

    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        String res = "";
        for(char c : s.toCharArray()){
            if(c == ']'){
               String tmp = "";
               while(st.peek() != '['){
                   tmp = st.pop() + tmp;
               } 
               st.pop();
               String n = "";
               while(!st.isEmpty() && st.peek() >= '0' && st.peek() <= '9'){
                   n = st.pop() + n;
               }
               String str = "";
               for(int i = 0;i < Integer.valueOf(n).intValue();i++) str += tmp;
               for(char t : str.toCharArray()) st.push(t);  
            }else{
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            res = st.pop() + res;
        }
        return res;
    }
}



