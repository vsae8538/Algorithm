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
     * 29%
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        for(;headB != null;headB = headB.next) set.add(headB);
        while(headA != null){
            if(set.contains(headA)) return headA;
            headA = headA.next;
        }
        return null;
    }

    /**
     * 5%
     */
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     if(headA == null || headB == null) return null;
    //     ListNode i = headA;
    //     ListNode j = headB;
    //     while(i != null){
    //         j = headB;
    //         while(j != null){
    //             if(j == i) return j;
    //             j = j.next;
    //         }
    //         i = i.next;
    //     }
    //     return null;
    // }

}



