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
     * 快慢指針
     * 
        1->2->3->4->5
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
    
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;
        
        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }

    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     ListNode pt = head;
    //     int len = 0;
    //     while(pt != null){
    //         len++;
    //         pt = pt.next;
    //     }
    //     int pos = len - n > 0 ? len-n:0;
    //     int count = 1;
    //     pt = head;
    //     if(pos == 0){
    //         if(pt.next != null){
    //             head = pt.next;
    //             pt = null;
    //         }else{
    //             return null;
    //         }
    //     }

    //     while(pt != null){
    //         if(count == pos){
    //             if(pt.next.next != null){
    //                 pt.next = pt.next.next;
    //             }else{
    //                 pt.next = null;
    //             }
    //             break;
    //         }
    //         pt = pt.next;
    //         count++;
            
    //     }

    //     return head;
    // }

    
}



