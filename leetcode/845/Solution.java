import java.math.BigDecimal;
import java.math.BigInteger;
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

class Solution{ 

    public int longestMountain(int[] arr) {
            int res = 0;
            int i = 0,j = 0;
            for(i = 0;i < arr.length - 1;i++){
                if(arr[i] < arr[i+1]){
                    int cnt = 1;
                    j = i;
                    while(j < arr.length - 1 && arr[j] < arr[j+1]){
                        j++;
                        cnt++;
                    }
                    if(j < arr.length - 1 && arr[j+1] < arr[j]){
                        while(j < arr.length - 1 && arr[j] > arr[j+1]){
                            j++;
                            cnt++;
                        }
                        res = Math.max(cnt, res);
                        i = j-1;
                    }
                }
            }
            return res;
    }

}