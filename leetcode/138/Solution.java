import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;


class Solution {

    
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Map<Node,Node> map = new HashMap<>();
        Node res = new Node(0);   
        Node pt = res;

        for(Node i = head;i != null;i = i.next){
            pt.next = new Node(i.val);
            map.put(i, pt.next);
            pt = pt.next;
        }   
    
        pt = res.next;
        for(Node i = head;i != null;i = i.next){
            pt.random = map.get(i.random); 
            pt = pt.next;
        }

        return res.next;
    }
}



