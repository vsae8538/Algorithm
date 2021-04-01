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

    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int index = 0;
        while(index < tokens.length){
            String s = tokens[index];
            if(s.equals("+") || s.equals("-") || s.equals("*") ||
                s.equals("/")){
                    int n1 = Integer.valueOf(stack.pop());
                    int n2 = Integer.valueOf(stack.pop());
                    String res = cal(s, n1, n2);
                    stack.push(res);
            }else{
                stack.push(s);
            }
            index++;
        }
        
        return Integer.valueOf(stack.pop());
    }


    public String cal(String s, int n1, int n2){
        int res = 0;
        if(s.equals("+")){
            res = n2 + n1;
        }
        else if(s.equals("-")){
            res = n2 - n1;
        }else if(s.equals("*")){
            res = n2 * n1;
        }else if(s.equals("/")){
            res = n2 / n1;
        }

        return String.valueOf(res);
    }

}
