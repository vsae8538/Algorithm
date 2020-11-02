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

    public boolean isPerfectSquare(int num) {
        if(num < 2) return true;
        long x, guess;
        long left = 2, right = num / 2;
        while(left <= right){
            x = left + (right - left) / 2;
            guess = x * x; //使用int溢出,
            if(guess == num) 
                return true;
            else if(guess > num)
                right = x-1;
            else if(guess < num)
                left = x+1;
        }
        return false;
    }
}



