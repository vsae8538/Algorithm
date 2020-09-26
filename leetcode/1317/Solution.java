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


    public int[] getNoZeroIntegers(int n) {
        int n2 = 1;
        int n1 = n;
        int st = 1;
        String s;
        String s2;
        while(st == 1){
            n1 = n - n2;
            //if("0".indexOf(""+n1) == -1 && "0".indexOf(""+n2) == -1){
            s = ""+n1;
            s2 = ""+n2;
            if(!s.contains("0") && !s2.contains("0")){
                st = 0;
                return new int[]{n1,n2};
            }
            n2++;    
        }

        return new int[]{-1,-1};
    }

}



