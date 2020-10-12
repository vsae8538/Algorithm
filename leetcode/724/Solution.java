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

    public int pivotIndex(int[] nums) {
        int mid = nums.length / 2;
        int k = 0;
        while(k < mid){
            int ln = 0, rn = 0;
            for(int i = 0;i < k;i++) ln += nums[i];
            for(int i = k+1;i < nums.length;i++) rn += nums[i];
            if(ln == rn) return k;
            k++;
        }
        k = mid;
        while(k < nums.length){
            int ln = 0, rn = 0;
            for(int i = 0;i < k;i++) ln += nums[i];
            for(int i = k+1;i < nums.length;i++) rn += nums[i];
            if(ln == rn) return k;
            k++;
        }

        return -1;
    }


}



