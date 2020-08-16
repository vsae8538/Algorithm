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
     * BFS
     */
    public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> queue = new LinkedList<>(); 
        queue.offer(root);
        while(!queue.isEmpty()){
            Queue<Node> tmpQueue = new LinkedList<>(queue);
            queue = new LinkedList<>(); 
            while(!tmpQueue.isEmpty()){
                Node node = tmpQueue.poll();
                if(!tmpQueue.isEmpty()){
                    Node next = tmpQueue.peek();
                    node.next = next;
                }else{
                    node.next = null;
                }                
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
        }
        return root;
    }
}
