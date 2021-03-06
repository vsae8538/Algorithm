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

    Map<Node,Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null) 
            return null;

        if(map.containsKey(node)){
            return map.get(node);
        }

        Node cloneNode = new Node(node.val);
        map.put(node, cloneNode);

        for(Node neighbor : node.neighbors){
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

        return cloneNode;
    }


}



