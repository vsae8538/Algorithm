import java.math.BigDecimal;
import java.math.MathContext;
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
import java.util.TreeMap;
import java.util.TreeSet;


class Solution {
    public boolean judgeSquareSum(int c) {
        if(c <= 2) return true;
        int left = 0, right = (int)Math.sqrt(c); //注意除以2 會溢出
        int guess = 0;
        while(left <= right){
            guess = left * left + right * right;
            
            if(guess == c){
                return true;
            }else{
                if(guess > c){
                    right--;
                }else if(guess < c){
                    left++;
                }
            }
        }
        
        return false;
    }
}



