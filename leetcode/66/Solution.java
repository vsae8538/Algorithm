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

    public int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        int carry = 0;
        for(int i = digits.length-1;i >= 0;i--){
            if(i == digits.length-1) digits[i] = digits[i]+ 1 + carry;
            else digits[i] += carry;
            if(digits[i] >= 10){
                digits[i] %= 10;
                carry = 1;
            }
            else 
                carry = 0;
                stack.push(digits[i]);
        }
        if(carry > 0) stack.push(carry);
        int[] res = new int[stack.size()];
        for(int i = 0;i < res.length;i++){
            res[i] = stack.pop();
        }
        return res;
    }

}



