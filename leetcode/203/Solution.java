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

/*&*



**/

class Solution {
    
    public ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode curr = head, prev = fakeHead;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return fakeHead.next;
    }

    /**
     * 92%
     * Space:5%
     */
    // public ListNode removeElements(ListNode head, int val) {
    //     if (head == null) return null;
    //     head.next = removeElements(head.next, val);
    //     return head.val == val ? head.next : head;
    // }

    /*
        23%
    */
    // public ListNode removeElements(ListNode head, int val) {
    //     if(head == null) return head;
    //     ListNode pt = head;
    //     List<Integer> list = new ArrayList<>();
    //     while(pt != null){
    //         if(pt.val != val) list.add(pt.val);
    //         pt = pt.next;
    //     }
    //     ListNode res = new ListNode(0);
    //     ListNode curr = res;
    //     for(int n : list){
    //         curr.next = new ListNode(n);
    //         curr = curr.next;
    //     }
    //     return res.next;
    // }
}



