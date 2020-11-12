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


public class Solution {

    public void sortIntegers(int[] A) {
        quickSort(A, 0, A.length-1);
    }
    
    public static void quickSort(int A[], int left, int right){
        if(left < right){
            int i = left,j = right;
            int k = A[left];
            while(i < j){
                while(i < j && A[j] >= k) j--;
                A[i] = A[j]; 
                while(i < j && A[i] <= k) i++;
                A[j] = A[i];
            }
            A[i] = k;
            quickSort(A, left, i - 1);
            quickSort(A, i + 1 , right);
        }
    }

}



