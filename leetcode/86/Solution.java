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

    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode res = new ListNode(0);
        ListNode curr = res;
        curr = linearTrackList(head, curr, 1, x);
        curr = linearTrackList(head, curr, 0, x);
        return res.next;
    }

    public ListNode linearTrackList(ListNode node, ListNode res, int mode, int x){
        ListNode pt = node;
        ListNode curr = res;
        while(pt != null){
            if((pt.val < x && mode == 1) || (pt.val >= x && mode == 0)){
                curr.next = new ListNode(pt.val);
                curr = curr.next;
            }
            pt = pt.next;
        }
        return curr;
    }

}



