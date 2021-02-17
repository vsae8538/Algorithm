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

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0;i < nums1.length && j < n;j++,i++){
            nums1[i] = nums2[j]; 
        } 
        q(nums1, 0, nums1.length-1);
    } 

    public void q(int[] a,int left, int right){
        if(left < right){
            int mid = partition(a, left, right);
            q(a,left, mid-1);
            q(a,mid+1, right);
        }
    }

    public int partition(int[] a,int left, int right){
        int i = left+1, j = right, pivot = a[left];
        while(i <= j){
            while(i <= j && a[i] <= pivot) i++;
            while(i <= j && a[j] > pivot) j--;
            if(i < j){ int tmp = a[i]; a[i] = a[j]; a[j] = tmp; }
        }
        int tmp = a[left]; a[left] = a[j]; a[j] = tmp;
        return j;
    }
    
}