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


    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        List<Integer> list = new ArrayList<>();
        ListNode pt = head;
        while(pt != null){
            list.add(pt.val);
            pt = pt.next;
        }

        int[] nums = new int[list.size()];
        for(int i = 0;i < list.size();i++){
            nums[(i + k) % list.size()] = list.get(i);
        }
        
        ListNode res = new ListNode(0);
        ListNode cur = res;
        for(int n : nums){
            cur.next = new ListNode(n);
            cur = cur.next;
        }
        return res.next;
    }

}



