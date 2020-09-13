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
     * 雙指針
     * 
     */
    public ListNode partition(ListNode head, int x) {
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;
        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = after_head.next;

        return before_head.next;
    }

    // public ListNode partition(ListNode head, int x) {
    //     if(head == null) return null;
    //     ListNode res = new ListNode(0);
    //     ListNode curr = res;
    //     curr = linearTrackList(head, curr, 1, x);
    //     curr = linearTrackList(head, curr, 0, x);
    //     return res.next;
    // }

    // public ListNode linearTrackList(ListNode node, ListNode res, int mode, int x){
    //     ListNode pt = node;
    //     ListNode curr = res;
    //     while(pt != null){
    //         if((pt.val < x && mode == 1) || (pt.val >= x && mode == 0)){
    //             curr.next = new ListNode(pt.val);
    //             curr = curr.next;
    //         }
    //         pt = pt.next;
    //     }
    //     return curr;
    // }

}



