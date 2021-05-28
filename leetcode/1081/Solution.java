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

    public String smallestSubsequence(String s) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        int[] inStk = new int[26];//去重

        int[] count = new int[26];
        for(int i = 0;i < s.length();i++){
            count[s.charAt(i) - 'a']++; //每個元素至少出現一次
        }

        for(Character c : s.toCharArray()){
            count[c - 'a']--;

            if(inStk[c - 'a'] == 0){
                while(!stack.isEmpty() && stack.peek() > c){ //單調堆疊，字母序
                    if(count[stack.peek() - 'a'] == 0){
                        break;
                    }
                    inStk[stack.pop() - 'a'] = 0;
                }

                stack.push(c);
                inStk[c - 'a'] = 1;
            }
        }


        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}

