import java.math.BigDecimal;
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


class Solution {   
    public int reverseInteger(int number) {
        StringBuffer sb = new StringBuffer();
        int i = 1, f = 0;
        while(number > 0){
            int n = number % 10;
            number /= 10;
            if(n != 0 && i == 1){
                f = n;
            }
            if(i > 1 && f == 0 && n == 0){
                continue;
            }else{
                sb.append(n);
            }
            i++;
        }
        return Integer.valueOf(sb.toString());
    }

}



