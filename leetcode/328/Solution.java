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

    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode res = new ListNode(head.val);
        ListNode tmp = res;
        ListNode even = head.next == null ? null : head.next.next;
        ListNode odd = head.next == null ? null : head.next;
        while(even != null && even.next != null){
            res.next = new ListNode(even.val);
            even = even.next.next;
            res = res.next;
        }
        
        if(even != null){
            res.next = new ListNode(even.val);
            res = res.next;
        }
        while(odd != null && odd.next != null){
            res.next = new ListNode(odd.val);
            odd = odd.next.next;
            res = res.next;
        }
        if(odd != null){
            res.next = new ListNode(odd.val);
        }
        return tmp;
    }

}



