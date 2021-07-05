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

    /**記憶化遞歸 */
    Map<Integer, Integer> f = new HashMap<Integer, Integer>();

    public int getKth(int lo, int hi, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = lo; i <= hi; ++i) {
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer u, Integer v) {
                if (getF(u) != getF(v)) {
                    return getF(u) - getF(v);
                } else {
                    return u - v;
                }
            }
        });
        return list.get(k - 1);
    }

    public int getF(int x) {
        if (!f.containsKey(x)) {
            if (x == 1) {
                f.put(x, 0);
            } else if ((x & 1) != 0) {
                f.put(x, getF(x * 3 + 1) + 1);
            } else {
                f.put(x, getF(x / 2) + 1);
            }
        }
        return f.get(x);
    }


    /**DFS */
    public int getKth(int lo, int hi, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = lo; i <= hi; ++i) {
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer u, Integer v) {
                if (getF(u) != getF(v)) {
                    return getF(u) - getF(v);
                } else {
                    return u - v;
                }
            }
        });
        return list.get(k - 1);
    }

    public int getF(int x) {
        if (x == 1) {
            return 0;
        } else if ((x & 1) != 0) {
            return getF(x * 3 + 1) + 1;
        } else {
            return getF(x / 2) + 1;
        }
    }



}   


