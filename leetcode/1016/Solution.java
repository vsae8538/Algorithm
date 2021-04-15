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
    

    public boolean queryString(String S, int N) {
        for(int i = 1;i <= N;i++){
            String bin = getBinString(i);
            //System.out.println(bin);
            if(!S.contains(bin)) return false;
        }
        return true;
    }

    public String getBinString(int n){
        StringBuffer sb = new StringBuffer();
        while(n > 0){
            int d = n % 2;
            n /= 2;
            sb.append(d);
        }
        
         
        return sb.reverse().toString();
    }

}
