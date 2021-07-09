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
import java.util.Random;

class Solution{

    public int countConsistentStrings(String allowed, String[] words) {
        Set <Character> set = new HashSet<>();
        int res = 0;
        for(char c : allowed.toCharArray()) set.add(c);
        for(String s : words){
            int n = 0;
            for(char c : s.toCharArray()){
                if(set.contains(c)){
                    n = 1;
                }else{
                    n = 0;
                    break;
                }
            }

            if(n == 1) res++;
        }   

        return res;
    }

}   


