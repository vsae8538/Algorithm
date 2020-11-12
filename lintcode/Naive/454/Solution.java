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


public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here
    int x;
    int y;
    
    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    
    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;

    }
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        return x * y > Integer.MAX_VALUE ? Integer.MAX_VALUE : x * y;
    }
}



