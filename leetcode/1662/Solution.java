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

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // StringBuffer sb1 = new StringBuffer();
        // StringBuffer sb2 = new StringBuffer();
        // for(String w : word1) sb1.append(w);
        // for(String w : word2) sb2.append(w);
        // return sb1.toString().equals(sb2.toString());
        return String.join("", word1).equals(String.join("", word2));
    }

    

}