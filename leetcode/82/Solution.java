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
     * 優化
     * 42%
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        Set<Integer> set = new HashSet<>();
        int preVal = head.val; 
        for(ListNode pt = head.next;pt != null;pt = pt.next){
            if(pt.val == preVal)
                set.add(pt.val);
            preVal = pt.val;
        }
        ListNode res = new ListNode(0);
        ListNode cur = res;
        
        for(ListNode pt = head;pt != null;pt = pt.next){
            if(!set.contains(pt.val)){
                cur.next = new ListNode(pt.val);
                cur = cur.next; 
            }
        }
        return res.next;
    }

}



