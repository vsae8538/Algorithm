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


    /**
     * TreeSet
     * 5%
     */
    public ListNode deleteDuplicates(ListNode head) {
        SortedSet<Integer> set = new TreeSet<Integer>();
        SortedSet<Integer> avSet = new TreeSet<Integer>();
        for(ListNode pt = head;pt != null;pt = pt.next){
            if(set.contains(pt.val)){
                set.remove(pt.val);
                avSet.add(pt.val);
            }else if(!avSet.contains(pt.val)){
                set.add(pt.val);
            }
        }
        ListNode res = new ListNode(0);
        ListNode cur = res;
        for(int i : set){
            cur.next = new ListNode(i); 
            cur = cur.next;
        }
        return res.next;
    }

}



