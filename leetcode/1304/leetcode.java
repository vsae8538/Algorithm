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
import java.util.Set;
import java.util.Stack;

class leetcode {
    public static void main(String[] args) {
        
    }
    //找出規則 A[i] = i * 2 - n + 1
    //n = 1, [0]
    //n = 2, [-1, 1]
    //n = 3, [-2, 0, 2]
    //n = 4, [-3, -1, 1, 3]
    //n = 5, [-4, -2, 0, 2, 4]
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int r = -n + 1;
        for(int i = 0;i < n;i++,r+=2){
            res[i] = r;
        }
        return res;        
    }

}   