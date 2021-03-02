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
    public int countSubstrings(String s) {
        int res = 0;
        /**
         * abba
         * center = 1, (ab)偶數字串 left = 1 , right = 1 + (center % 2) = 2
         * center = 2, (abb)奇數字串 left = 1, right = 1 + (center % 2) = 1    
         */
        for (int center = 0; center < 2 * s.length() - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;//center % 2 => 偶數字串時right指向left+1,奇數字串時left=right
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                res++;
                left--;
                right++;
            }
        }

        return res;
    }

}
