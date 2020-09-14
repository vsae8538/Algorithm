import java.lang.reflect.Array;
import java.math.BigInteger;
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


    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        Set<ListNode> set = new HashSet<>();
        while(fast != null){
            fast = fast.next;
            if(set.contains(fast)) return fast;
            set.add(fast);
        }
        return null;
    }

}



