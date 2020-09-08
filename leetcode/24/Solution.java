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
     * O(n)
     */
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;

        List<Integer> list = new LinkedList<>();
        ListNode pt = head;
        for(;pt != null;pt = pt.next) list.add(pt.val);

        int[] arr = new int[list.size()];
        int j = 1,i = 0;
        int len = list.size() % 2 != 0 ? list.size()-1 : list.size();
        while(j < len){
            arr[i] = list.get(j);
            arr[j] = list.get(i);
            j+=2;
            i+=2; 
        }
        if(list.size() % 2 != 0) arr[list.size()-1] = list.get(list.size()-1);

        ListNode last = new ListNode(arr[0]);
        head = last;
        for(i = 1;i < arr.length;i++){
            last.next = new ListNode(arr[i]);
            last = last.next;
        }

        return head;
    }

}



