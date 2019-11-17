import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
  
    }
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < S.length();i++){
            if(S.charAt(i) == '#'){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else stack.push(S.charAt(i));
        }
        StringBuffer sb = new StringBuffer();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();
        for(int i = 0;i < T.length();i++){
            if(T.charAt(i) == '#'){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else stack.push(T.charAt(i));
        }
        StringBuffer sb2 = new StringBuffer();
        while(!stack.isEmpty())
            sb2.append(stack.pop());
        sb2.reverse();
        return sb.toString().equals(sb2.toString()) ? true : false;
    }
}
