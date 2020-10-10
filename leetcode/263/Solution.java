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
import java.util.TreeMap;
import java.util.TreeSet;


class Solution {

    public boolean isUgly(int num) {
        int n;
        while(num > 1){
            if(num % 2 == 0){
                num /= 2; 
            }else if(num % 3 == 0){
                num /= 3;
            }else if(num % 5 == 0){
                num /= 5;
            }else{
                return false;
            }
        }
        return true;
    }

}



