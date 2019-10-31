import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
  
    }
    //思路：可直接看尾數,能被5整除的數尾數必然為5或0
    /*
        0101111
        tail = tail * 2 + i
        0  -> 0
        01 ->  0 * 2  + 1 = 1
        010 ->  1 * 2 + 0 = 2
        0101 -> 2 * 2 + 0 = 4
     */
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int tail = 0;
        for(int n : A){
            tail = tail * 2 + n;
            tail = tail > 9 ? tail - 10 : tail;
            if(tail == 5 || tail == 0)
                res.add(true);
            else 
                res.add(false);
        }
        return res;    
    }
}
