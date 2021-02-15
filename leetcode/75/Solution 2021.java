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

    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1;
        quickSort(a, left, right);
    }

    public void quickSort(int a[], int left, int right){
        if(left <= right){
            int mid = partiton(a, left, right);
            quickSort(a, mid + 1, right);
            quickSort(a, left, mid - 1);
        }
    }
    
    public int partiton(int[] a, int left, int right){
        int i = left + 1, j = right, pivot = a[left];
        while(i <= j){
            while(i <= j && a[i] <= pivot) i++;
            while(i <= j && a[j] > pivot) j--;
            if(i < j){
                swap(a, i, j);
            }
        }
        
        swap(a, left, j);

        return j;
    }

    public void swap(int a[], int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}