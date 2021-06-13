import java.math.BigDecimal;
import java.math.BigInteger;
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

class Solution{

    ListNode lNode, rNode;
    public ListNode swapNodes(ListNode head, int k) {
        int len = getLength(head);
        int lastNum = len - k + 1;
        lNode = func(head, k);
        rNode = func(head, lastNum);
        int tmp = lNode.val;
        lNode.val = rNode.val;
        rNode.val = tmp;

        return head;
    }

    public ListNode func(ListNode head, int num){
        ListNode node;
        int cnt = 1;
        while(head != null && cnt < num){
            head = head.next;
            cnt++;
        }

        node = head;
        return node;
    } 

    public int getLength(ListNode head){
        int cnt = 1;
        while(head != null){
            head = head.next;
            cnt++;
        }
        
        return cnt;
    }

}
