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
     * 100%
     * 
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode prev = head;
        for(ListNode pt = head;pt != null;pt = pt.next){
            if(pt.val != prev.val){
                prev.next = pt;
                prev = pt;
            }
        }
        prev.next = null;
        return head;
    }

    /*
        TreeSet
        faster then 35%
    */
    // public ListNode deleteDuplicates(ListNode head) {
    //     SortedSet<Integer> set = new TreeSet<>();
    //     for(ListNode pt = head;pt != null;pt = pt.next) set.add(pt.val);
    //     ListNode res = new ListNode(0);
    //     ListNode cur = res;
    //     for(int i : set){
    //         cur.next = new ListNode(i); 
    //         cur = cur.next;
    //     }
    //     return res.next;
    // }

}



