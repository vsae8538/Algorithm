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


    // public String interpret(String command) {
    //     command = command.replace("()", "o");
    //     command = command.replace("(", "");
    //     command = command.replace(")", "");
    //     return command;
    // }

    public String interpret(String command) {
        Stack<Character> stack = new Stack<>();
        char[] chs = command.toCharArray();
        String res = "";
        for(char c : chs){
            if(stack.isEmpty() && c != '(' && c != ')') res = res + c;
            else if(c == '(') stack.push(c);
            else if(!stack.isEmpty() && stack.peek() == '(' && c == ')'){ 
                stack.pop(); 
                res = res + 'o';
            }
            else if(!stack.isEmpty() && stack.peek() != '(' && c == ')'){
                String s = "";
                while(!stack.isEmpty()){
                    char ch = stack.pop();
                    if(ch != '(') s = ch + s;
                }
                res = res + s;
            }else{
                stack.push(c);
            }
        }

        return res;
    }

}