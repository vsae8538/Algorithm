import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import jdk.nashorn.api.tree.Tree;

class Solution {

    public static void main(String[] args) {    
        
    }

    /**
     * 
     * 使用單鍊表解決替代常量空間
     * 
     */
    public Node connect(Node root) {
        Node head = root;
        while(head != null) {
            Node level = new Node();
            Node tail = level;
            while(head != null) {
                if (head.left != null) {
                    tail.next = head.left;
                    tail = tail.next;
                }
                if (head.right != null) {
                    tail.next = head.right;
                    tail = tail.next;
                }
                head = head.next;
            }
            head = level.next;
        }

        return root;
    }
}
