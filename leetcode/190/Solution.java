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


    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0;i < 32;i++){
            res <<= 1;
            res |= (n & 1);
            n >>= 1;
        }
        return res;
    }


    /**
     * Runtime: 19 ms, faster than 8.25% of Java online submissions for Reverse Bits.
Memory Usage: 41.5 MB, less than 5.17% of Java online submissions for Reverse Bits.
     * @param n
     * @return
     */
    public int reverseBits(int n) {
        String tmp = "";
        for(int i = 0;i < 32;i++){
            tmp = (n & 1) + tmp;
            n >>= 1;
        }

        int res = 0;
        int pt = 1;
        for(char c : tmp.toCharArray()){
            int num = (int)c - '0';
            res += num == 1 ? pt : 0;
            pt = pt * 2;
        }

        return res;
    }

}   


