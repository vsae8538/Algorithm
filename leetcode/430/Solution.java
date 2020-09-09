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
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

class Solution {

    /**
     * 多級鏈結串列的扁平化類似二元樹的preOrder
     * 1.prev紀錄上一個節點,用於建立雙向鏈結
     * 2.左子樹相當於child,右子樹相當於next
     * 3.記得將每處理完一個child設為null
     */

    Node prev = null; 
    public Node flatten(Node head) {
        preOrderDFS(head);
        return head; 
    }

    public void preOrderDFS(Node head){
        if(head == null) return;
        Node next = head.next;
        if(prev != null){
            prev.next = head;
            head.prev = prev;
        }
        prev = head;
        preOrderDFS(prev.child);
        head.child = null;
        preOrderDFS(next);
    }


    // public Node flatten(Node head) {
    //     if (head == null) return head;
    //     Node pseudoHead = new Node(0, null, head, null);
    
    //     flattenDFS(pseudoHead, head);
    //     pseudoHead.next.prev = null;
    //     return pseudoHead.next;
    // }

    // public Node flattenDFS(Node prev, Node curr) {
    //     if (curr == null) return prev;
    //     curr.prev = prev;
    //     prev.next = curr;

    //     Node tempNext = curr.next;
    
    //     Node tail = flattenDFS(curr, curr.child);
    //     curr.child = null;
    
    //     return flattenDFS(tail, tempNext);
    // }
}



