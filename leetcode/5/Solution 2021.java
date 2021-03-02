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
    /*
     * 中心擴展
     */
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;            
        String res = "";
        for(int i = 0;i < s.length() * 2 - 1;i++){
            int left = i / 2;
            int right = left + (i % 2);

            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                String tmp = s.substring(left,right+1);
                if(tmp.length() > res.length()) res = tmp;
                left--;
                right++;
            }
        }

        return res;
    }

}
