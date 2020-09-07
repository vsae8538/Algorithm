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
        Absolute garbage explanation and test cases from leetcode. Let me help, here are some sample inputs:

        List =>  0->1->2->3->4->5->6->7->NULL
        G    =>  [0,2,3,5,7]
        Every element of the linked list that is in G is a component. So these are all components (marked with a 'c'):

                 c     c  c     c     c
        List =>  0->1->2->3->4->5->6->7->NULL
        If you were to group together all of the components (c), then you would have the following groups:

        0->
        2->3->
        5->
        7->
        Thus, 4 components... you're welcome.
     */
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> setG = new HashSet<>();
        for (int i: G) setG.add(i);
        int res = 0;
        while (head != null) {
            if (setG.contains(head.val) && (head.next == null || !setG.contains(head.next.val))) res++;
            head = head.next;
        }
        return res;
    }


    
    /*

        ?
    */
    public int numComponents(ListNode head, int[] G) {
        String listStr = "";
        ListNode pt = head;
        while(pt != null){
            listStr += pt.val;
            pt = pt.next;
        }
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : G) set.add(i);
        for(int i = 0;i < listStr.length()-1;i++){
            int n = listStr.charAt(i) - '0';
            if(set.isEmpty()) break;
            if(set.contains(n)){
                int n2 = listStr.charAt(i+1) - '0';
                String s = String.valueOf(n) + String.valueOf(n2); 
                if(set.contains(n2) && listStr.indexOf(s) != -1){
                    res++;
                    set.remove(n);
                    set.remove(n2);
                }
            }
        }
        if(!set.isEmpty()){
            for(int i : set)
                if(listStr.indexOf(i+"") != -1) res++;
        }
        return res;
    }   
}



