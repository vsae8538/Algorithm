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

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {


    /**
     * 21.25%
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        Map<Node,Node> map = new HashMap<>();
        Node res = new Node(0);
        Node pt = head;
        int i = 0;
        while(pt != null){
            map.put(pt, new Node(pt.val));
            pt = pt.next; 
        }
        Node curr = res;
        pt = head;
        while(pt != null){
            curr.next = map.get(pt);
            curr.next.random = pt.random == null ? null:map.get(pt.random);
            curr = curr.next;
            pt = pt.next;
        }
        return res.next;
    }
}



