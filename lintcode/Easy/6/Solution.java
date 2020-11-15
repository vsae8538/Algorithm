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

class Solution {


    public int[] mergeSortedArray(int[] A, int[] B) {
        int i = 0, j = 0,k = 0;
        int[] res = new int[A.length + B.length];
        while(i < A.length || j < B.length){
            if(i >= A.length){
                res[k] = B[j];
                j++;
            }else if(j >= B.length){
                res[k] = A[i];
                i++;
            }else if(A[i] < B[j]){
                res[k] = A[i];
                i++;
            }else{
                res[k] = B[j];
                j++;
            }
            k++;
        }

        return res;
    }
}