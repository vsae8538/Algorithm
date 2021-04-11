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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tail = null;
        ListNode pt = list1;
        
        for(int i = 0;i < a - 1;i++) pt = pt.next;
        
        tail = pt.next;
        for(int i = a;i <= b;i++) tail = tail.next; 
        
        pt.next = list2;
        ListNode cur = list2;
        
        while(cur.next != null) cur = cur.next;

        cur.next = tail;

        return list1;
    }
}
