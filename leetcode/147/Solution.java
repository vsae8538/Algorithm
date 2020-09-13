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

    public ListNode insertionSortList(ListNode head) {
		if( head == null ) return head;
		ListNode helper = new ListNode(0);
		ListNode cur = head;
		ListNode pre = helper;
		ListNode next = null;
		while( cur != null ){
			next = cur.next;
			while( pre.next != null && pre.next.val < cur.val ){
				pre = pre.next;
			}
			cur.next = pre.next;
			pre.next = cur;
			pre = helper;
			cur = next;
		}
		return helper.next;
	}

}



