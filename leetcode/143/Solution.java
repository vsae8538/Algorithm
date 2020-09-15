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

    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }     
        ListNode list1 = head;
        ListNode list2 = reverseList(slow);   
        slow.next = null;

        while(list1 != null && list2 != null){
            ListNode tmp1 = list1.next;
            ListNode tmp2 = list2.next;
            list1.next = list2;
            list2.next = list1.next;
            list1 = tmp1;
            list2 = tmp2; 
        }

    }

    public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }

}



