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
    public int[] nextLargerNodes(ListNode head) {
        int idx = 0;
        int[] arr = travel(head);
        int[] res = new int[arr.length];
        for(int i = 0;i < arr.length-1;i++){
            for(int j = i+1;j < arr.length;j++){
                if(arr[j] > arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }

    public int[] travel(ListNode head){
        List<Integer> list = new ArrayList<>();
        ListNode pt = head;
        while(pt != null){
            list.add(pt.val);
            pt = pt.next;
        }
        return list.stream().mapToInt(i->i).toArray();
    }

}



