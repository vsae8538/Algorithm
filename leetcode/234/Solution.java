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

    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode pt = head;
        List<Integer> list = new ArrayList<>();
        while(pt != null){
            list.add(Math.abs(pt.val));
            pt = pt.next;
        }
        for(int i = 0,j = list.size()-1;i < j;i++,j--){
            if(list.get(i).intValue() != list.get(j).intValue()) return false;
        }
        return true;
    }
}



