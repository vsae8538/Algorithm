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

    /**
     * 01
     * 11
     * 100
     * 001
     * 111
     * 1000
     */
    public String addBinary(String a, String b) {
        StringBuffer res = new StringBuffer();
        if(b.length() < a.length()){
            int len = a.length() - b.length();
            for(int i = 0;i < a.length() - b.length();i++)
            b = '0' + b;
        }
        else if(b.length() > a.length()){
            int len = b.length() - a.length();
            for(int i = 0;i < b.length() - a.length();i++){
                a = '0' + a;
            }
        }       
        int i = a.length() - 1,carry = 0;
        while(i >= 0){
            int n1 = a.charAt(i) - '0';
            int n2 = b.charAt(i) - '0';
            int n = n1 + n2 + carry;
            if(n > 1) 
                carry = 1;
            else
                carry = 0;
            n %= 2;
            res.append(n);
            i--;
        }
        if(carry > 0) res.append(carry);
        return res.reverse().toString();
    }

}



